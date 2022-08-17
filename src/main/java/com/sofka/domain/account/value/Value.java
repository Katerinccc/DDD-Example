package com.sofka.domain.account.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Value implements ValueObject<Integer> {

    private final Integer value;

    public Value(Integer value) {
        this.value = Objects.requireNonNull(value);
        if(this.value < 0){
            throw new IllegalArgumentException("The value cannot be negative");
        }
    }


    @Override
    public Integer value() {
        return value;
    }
}
