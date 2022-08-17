package com.sofka.domain.account.value;

import co.com.sofka.domain.generic.ValueObject;
import java.util.Objects;

public class AccountName implements ValueObject<String> {

    private final String value;

    public AccountName(String value) {
        this.value = Objects.requireNonNull(value);
    }


    @Override
    public String value() {
        return value;
    }
}
