package com.sofka.domain.account.value;

import co.com.sofka.domain.generic.Identity;

public class AccountID extends Identity {

    public AccountID() {

    }

    public AccountID(String id) {
        super(id);
    }

    public static AccountID of (String id){
        return new AccountID(id);
    }

}
