package com.sofka.domain.account.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.account.value.AccountName;

public class AccountCreated extends DomainEvent {

    private final AccountName name;
    public AccountCreated(AccountName name) {
        super("sofka.domain.account.AccountCreated");
        this.name = name;
    }

    public AccountName getName() {
        return name;
    }
}
