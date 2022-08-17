package com.sofka.domain.account.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.account.value.AccountID;
import com.sofka.domain.account.value.IncomeAccountID;

public class CalculateIncomeBalance extends Command {

    private final AccountID accountId;
    private final IncomeAccountID entityID;

    public CalculateIncomeBalance(AccountID accountId, IncomeAccountID entityID) {
        this.accountId = accountId;
        this.entityID = entityID;
    }

    private void calculateBalance(){
        // TODO: Calculate balance is the sum of the transactions values
    }

}
