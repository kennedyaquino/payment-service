package br.com.kennedy.psp.usescases;

import br.com.kennedy.psp.entities.Transactions;

import java.util.List;

public interface IListTransactionsUseCase {

    List<Transactions> getListTransactions();
}
