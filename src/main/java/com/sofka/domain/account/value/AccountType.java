package com.sofka.domain.account.value;

import co.com.sofka.domain.generic.ValueObject;

public class AccountType implements ValueObject<AccountTypeE> {

    private final AccountTypeE value;

    public AccountType(AccountTypeE value) {
        this.value = value;
    }

    @Override
    public AccountTypeE value() {
        return value;
    }
}
