package br.com.kennedy.psp.usescases;

import br.com.kennedy.psp.entities.dto.TransactionFormDto;

public interface ICreateTransaction {

    void createTransaction(TransactionFormDto form);
}
