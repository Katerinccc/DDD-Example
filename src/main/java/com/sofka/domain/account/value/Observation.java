package com.sofka.domain.account.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Observation implements ValueObject<String> {

    private final String value;

    public Observation(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.length() < 10){
            throw new IllegalArgumentException("The observation needs at least 10 characters.");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
