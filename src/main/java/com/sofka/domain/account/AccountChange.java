package com.sofka.domain.account;

import co.com.sofka.domain.generic.EventChange;
import com.sofka.domain.account.event.AccountCreated;

public class AccountChange extends EventChange {

    public AccountChange(Account account){

        apply((AccountCreated event) -> {
            account.name = event.getName();
        });


    }

}
