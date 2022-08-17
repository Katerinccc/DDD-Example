package com.sofka.domain.account.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.account.value.AccountID;
import com.sofka.domain.account.value.AccountName;
import com.sofka.domain.account.value.IncomeAccountID;

public class AddIncomeAccount extends Command {

    private final AccountID accountId;
    private final IncomeAccountID entityID;
    private final AccountName name;

    public AddIncomeAccount(AccountID accountId, IncomeAccountID entityID, AccountName name) {
        this.accountId = accountId;
        this.entityID = entityID;
        this.name = name;
    }

    public AccountID getAccountId() {
        return accountId;
    }

    public IncomeAccountID getEntityID() {
        return entityID;
    }

    public AccountName getName() {
        return name;
    }
}
