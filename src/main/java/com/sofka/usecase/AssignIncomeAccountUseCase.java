package com.sofka.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import com.sofka.domain.account.Account;
import com.sofka.domain.account.event.AccountCreated;
import com.sofka.domain.account.value.AccountID;
import com.sofka.domain.account.value.AccountName;
import com.sofka.domain.account.value.Balance;
import com.sofka.domain.account.value.IncomeAccountID;

public class AssignIncomeAccountUseCase extends UseCase<TriggeredEvent<AccountCreated>, ResponseEvents> {

    @Override
    public void executeUseCase(TriggeredEvent<AccountCreated> accountCreatedTriggeredEvent) {

        AccountCreated event = accountCreatedTriggeredEvent.getDomainEvent();
        Account account = Account.from(AccountID.of(event.aggregateRootId()), this.retrieveEvents());
        IncomeAccountID incomeAccountID = new IncomeAccountID();
        AccountName name = new AccountName(event.getName().value() + ".Income");
        Balance balance = new Balance(0);
        account.assignIncomeAccount(incomeAccountID, name, balance);
        emit().onResponse(new ResponseEvents(account.getUncommittedChanges()));
    }
}
