package com.sofka.domain.account;

import co.com.sofka.domain.generic.Entity;
import com.sofka.domain.account.value.AccountType;
import com.sofka.domain.account.value.DateTransaction;
import com.sofka.domain.account.value.Observation;
import com.sofka.domain.account.value.TransactionID;
import com.sofka.domain.account.value.Value;

public class Transaction extends Entity<TransactionID> {

    private Value value;
    private Observation observation;
    private DateTransaction dateTransaction;
    private AccountType accountType;

    public Transaction(TransactionID entityId, Value value, Observation observation, AccountType accountType) {
        super(entityId);
        this.value = value;
        this.observation = observation;
        this.accountType = accountType;
    }

    public Value value() {
        return value;
    }

    public Observation observation() {
        return observation;
    }

    public DateTransaction date() {
        return dateTransaction;
    }

    public AccountType accountType() {
        return accountType;
    }
}
