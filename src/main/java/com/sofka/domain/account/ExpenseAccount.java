package com.sofka.domain.account;

import co.com.sofka.domain.generic.Entity;
import com.sofka.domain.account.value.AccountName;
import com.sofka.domain.account.value.Balance;
import com.sofka.domain.account.value.ExpenseAccountID;
import java.util.Objects;

public class ExpenseAccount extends Entity<ExpenseAccountID> {

    private AccountName name;
    private Balance balance;

    public ExpenseAccount(ExpenseAccountID entityId, AccountName name, Balance balance) {
        super(entityId);
        this.name = name;
        this.balance = balance;
    }

    public void updateExpenseAccountName(AccountName name){
        this.name = Objects.requireNonNull(name);
    }

    public AccountName name() {
        return name;
    }

    public Balance balance() {
        return balance;
    }

}
