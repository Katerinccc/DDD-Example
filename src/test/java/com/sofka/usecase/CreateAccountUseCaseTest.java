package com.sofka.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.domain.account.command.CreateAccount;
import com.sofka.domain.account.event.AccountCreated;
import com.sofka.domain.account.value.AccountName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
class CreateAccountUseCaseTest {

    @Test
    public void createAccountUseCaseTest(){

        CreateAccount command = new CreateAccount(new AccountName("Bancolombia"));
        CreateAccountUseCase useCase = new CreateAccountUseCase();

        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong creating account"))
                .getDomainEvents();

        AccountCreated event = (AccountCreated) events.get(0);

        Assertions.assertEquals(command.getName().value(), event.getName().value());

    }

}