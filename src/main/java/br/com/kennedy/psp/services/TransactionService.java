package br.com.kennedy.psp.services;

import br.com.kennedy.psp.entities.Transactions;
import br.com.kennedy.psp.entities.dto.TransactionFormDto;
import br.com.kennedy.psp.usescases.ICreateTransaction;
import br.com.kennedy.psp.usescases.IListTransactions;

import java.util.List;

public class TransactionService implements ICreateTransaction, IListTransactions {

    @Override
    public void createTransaction(TransactionFormDto form) {

    }

    @Override
    public List<Transactions> getListTransactions() {
        return null;
    }
}
