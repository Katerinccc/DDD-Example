package com.sofka.domain.account.value;

import co.com.sofka.domain.generic.Identity;

public class TransactionID extends Identity {

    public TransactionID() {

    }

    public TransactionID(String id) {
        super(id);
    }

    public static TransactionID of (String id){
        return new TransactionID(id);
    }

}
