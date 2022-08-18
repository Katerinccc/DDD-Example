package com.sofka.domain.account.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.account.value.AccountName;
import com.sofka.domain.account.value.Balance;
import com.sofka.domain.account.value.IncomeAccountID;

public class IncomeAccountAdded extends DomainEvent {

    private final IncomeAccountID entityID;
    private final AccountName name;
    private final Balance balance;

    public IncomeAccountAdded(IncomeAccountID entityID, AccountName name, Balance balance) {
        super("Income account added.");
        this.entityID = entityID;
        this.name = name;
        this.balance = balance;
    }

    public IncomeAccountID getEntityID() {
        return entityID;
    }

    public AccountName getName() {
        return name;
    }

    public Balance getBalance() {
        return balance;
    }
}
