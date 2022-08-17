package com.sofka.domain.account.value;

import co.com.sofka.domain.generic.Identity;

public class ExpenseAccountID extends Identity {


    public ExpenseAccountID() {

    }

    public ExpenseAccountID(String id) {
        super(id);
    }

    public static ExpenseAccountID of (String id){
        return new ExpenseAccountID(id);
    }

}
