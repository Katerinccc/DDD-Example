package com.sofka.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.domain.account.Account;
import com.sofka.domain.account.command.CreateAccount;

public class CreateAccountUseCase extends UseCase<RequestCommand<CreateAccount>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CreateAccount> createAccountRequestCommand) {

        CreateAccount createAccount = createAccountRequestCommand.getCommand();
        Account account = new Account(createAccount.getAccountID(), createAccount.getName());
        emit().onResponse(new ResponseEvents(account.getUncommittedChanges()));
    }
}
