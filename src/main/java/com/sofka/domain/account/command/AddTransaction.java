package com.sofka.domain.account.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.account.value.AccountID;
import com.sofka.domain.account.value.DateTransaction;
import com.sofka.domain.account.value.Observation;
import com.sofka.domain.account.value.TransactionID;
import com.sofka.domain.account.value.Value;

public class AddTransaction extends Command {

    private final AccountID accountId;
    private final TransactionID entityID;
    private final Value value;
    private final Observation observation;
    private final DateTransaction date;

    public AddTransaction(AccountID accountId, Value value, Observation observation) {
        this.accountId = accountId;
        this.entityID = new TransactionID();
        this.value = value;
        this.observation = observation;
        this.date = new DateTransaction();
    }

    public AccountID getAccountId() {
        return accountId;
    }

    public TransactionID getEntityID() {
        return entityID;
    }

    public Value getValue() {
        return value;
    }

    public Observation getObservation() {
        return observation;
    }

    public DateTransaction getDate() {
        return date;
    }
}
