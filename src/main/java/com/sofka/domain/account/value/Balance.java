package com.sofka.domain.account.value;

import co.com.sofka.domain.generic.ValueObject;
import com.sofka.domain.account.Transaction;
import java.util.List;

public class Balance implements ValueObject<Integer> {

    private final Integer value;

    public Balance(Integer value) {
        this.value = value;
    }

    @Override
    public Integer value() {
        return value;
    }
}
