package com.sofka.domain.account.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.account.value.AccountID;
import com.sofka.domain.account.value.AccountName;

public class CreateAccount extends Command {

    private final AccountID accountID;
    private final AccountName name;

    public CreateAccount(AccountName name) {
        this.accountID = new AccountID();
        this.name = name;
    }

    public AccountID getAccountID() {
        return accountID;
    }

    public AccountName getName() {
        return name;
    }
}
