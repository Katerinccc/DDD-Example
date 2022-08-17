package com.sofka.domain.account.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.account.value.AccountID;
import com.sofka.domain.account.value.Observation;
import com.sofka.domain.account.value.TransactionID;

public class ObservationUpdated extends DomainEvent {

    private final TransactionID entityID;
    private final Observation observation;


    public ObservationUpdated(TransactionID entityID, Observation observation) {
        super("entityID updated");
        this.entityID = entityID;
        this.observation = observation;
    }

    public TransactionID getTransitionID() {
        return entityID;
    }

    public Observation getObservation() {
        return observation;
    }
}
