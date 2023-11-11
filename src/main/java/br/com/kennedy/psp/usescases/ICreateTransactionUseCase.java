package br.com.kennedy.psp.usescases;

import br.com.kennedy.psp.entities.dto.TransactionFormDto;

public interface ICreateTransactionUseCase {

    void createTransaction(TransactionFormDto form);
}
