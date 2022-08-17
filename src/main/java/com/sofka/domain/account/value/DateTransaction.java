package com.sofka.domain.account.value;

import co.com.sofka.domain.generic.ValueObject;
import java.time.Instant;

public class DateTransaction implements ValueObject<Instant> {

    private final Instant value;

    public DateTransaction() {
        this.value = Instant.now();
    }

    @Override
    public Instant value() {
        return value;
    }
}
