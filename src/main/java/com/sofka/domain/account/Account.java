package com.sofka.domain.account;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.account.event.AccountCreated;
import com.sofka.domain.account.event.IncomeAccountAdded;
import com.sofka.domain.account.event.ObservationUpdated;
import com.sofka.domain.account.value.AccountID;
import com.sofka.domain.account.value.AccountName;
import com.sofka.domain.account.value.Balance;
import com.sofka.domain.account.value.IncomeAccountID;
import com.sofka.domain.account.value.Observation;
import com.sofka.domain.account.value.TransactionID;
import java.util.List;
import java.util.Objects;

public class Account extends AggregateEvent<AccountID> {

    protected AccountName name;
    protected IncomeAccount incomeAccount;
    protected ExpenseAccount expenseAccount;
    protected List<Transaction> transactions;

    private Account(AccountID accountID){
        super(accountID);
        subscribe(new AccountChange(this));
    }

    public static Account from(AccountID accountID, List<DomainEvent> events){
        Account account = new Account(accountID);
        events.forEach(event -> account.applyEvent(event));
        return account;
    }

    public Account(AccountID entityId, AccountName name) {
        super(entityId);
        appendChange(new AccountCreated(name)).apply();
    }

    public void assignIncomeAccount(IncomeAccountID incomeAccountID, AccountName name, Balance balance){
        Objects.requireNonNull(incomeAccountID);
        Objects.requireNonNull(name);
        Objects.requireNonNull(balance);
        appendChange(new IncomeAccountAdded(incomeAccountID, name, balance)).apply();
    }

    public void updateTransactionObservation(TransactionID transactionId, Observation observation){
        Objects.requireNonNull(transactionId);
        Objects.requireNonNull(observation);
        appendChange(new ObservationUpdated(transactionId, observation)).apply();
    }
}
