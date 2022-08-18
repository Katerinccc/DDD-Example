package com.sofka.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.TriggeredEvent;
import com.sofka.domain.account.event.AccountCreated;
import com.sofka.domain.account.event.IncomeAccountAdded;
import com.sofka.domain.account.value.AccountName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class AssignIncomeAccountUseCaseTest {

    private final String ROOT_ID = "123456789";

    @Mock
    private DomainEventRepository repository;

    @Test
    void assignIncomeAccountTest(){
        // Arrange
        AccountCreated event = new AccountCreated(new AccountName("Bancolombia"));
        event.setAggregateRootId(ROOT_ID);
        var useCase = new AssignIncomeAccountUseCase();
        Mockito.when(repository.getEventsBy(ROOT_ID)).thenReturn(List.of(event));
        useCase.addRepository(repository);

        //Act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(ROOT_ID)
                .syncExecutor(useCase, new TriggeredEvent<>(event))
                .orElseThrow()
                .getDomainEvents();

        IncomeAccountAdded responseEvent = (IncomeAccountAdded) events.get(0);

        //Assert

        Assertions.assertEquals(responseEvent.getName().value(), "Bancolombia.Income");
        Mockito.verify(repository).getEventsBy(ROOT_ID);

    }

}