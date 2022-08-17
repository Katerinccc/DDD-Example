package com.sofka.domain.account.value;

import co.com.sofka.domain.generic.Identity;

public class IncomeAccountID extends Identity {

    public IncomeAccountID() {

    }

    public IncomeAccountID(String id) {
        super(id);
    }

    public static IncomeAccountID of (String id){
        return new IncomeAccountID(id);
    }

}
