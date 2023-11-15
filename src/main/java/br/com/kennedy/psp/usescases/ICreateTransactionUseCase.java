package br.com.kennedy.psp.usescases;

import br.com.kennedy.psp.entities.Transactions;
import br.com.kennedy.psp.entities.dto.TransactionFormDto;

public interface ICreateTransactionUseCase {

    Transactions createTransaction(TransactionFormDto form);
}
