package com.sofka.domain.account.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.account.value.AccountID;
import com.sofka.domain.account.value.Observation;
import com.sofka.domain.account.value.TransactionID;

public class updateObservation extends Command {

    private final AccountID accountId;
    private final TransactionID entityID;
    private final Observation observation;

    public updateObservation(AccountID accountId, TransactionID entityID, Observation observation) {
        this.accountId = accountId;
        this.entityID = entityID;
        this.observation = observation;
    }

    public AccountID getAccountId() {
        return accountId;
    }

    public TransactionID getEntityID() {
        return entityID;
    }

    public Observation getObservation() {
        return observation;
    }
}
