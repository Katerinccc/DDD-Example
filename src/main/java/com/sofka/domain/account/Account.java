package com.sofka.domain.account;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.domain.account.event.AccountCreated;
import com.sofka.domain.account.event.ObservationUpdated;
import com.sofka.domain.account.value.AccountID;
import com.sofka.domain.account.value.AccountName;
import com.sofka.domain.account.value.Observation;
import com.sofka.domain.account.value.TransactionID;
import java.util.List;
import java.util.Objects;

public class Account extends AggregateEvent<AccountID> {

    protected AccountName name;
    protected IncomeAccount incomeAccount;
    protected ExpenseAccount expenseAccount;
    protected List<Transaction> transactions;

    public Account(AccountID entityId, AccountName name) {
        super(entityId);
        appendChange(new AccountCreated(name)).apply();
    }

    public void updateTransactionObservation(TransactionID transactionId, Observation observation){
        Objects.requireNonNull(transactionId);
        Objects.requireNonNull(observation);
        appendChange(new ObservationUpdated(transactionId, observation)).apply();
    }
}
