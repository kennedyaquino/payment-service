package br.com.kennedy.psp.services;

import br.com.kennedy.psp.entities.Transactions;
import br.com.kennedy.psp.entities.dto.TransactionFormDto;
import br.com.kennedy.psp.repositories.TransactionsRepository;
import br.com.kennedy.psp.usescases.ICreateTransaction;
import br.com.kennedy.psp.usescases.IListTransactions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TransactionService implements ICreateTransaction, IListTransactions {

    private TransactionsRepository repository;

    @Autowired
    public TransactionService(TransactionsRepository repository) {
        this.repository = repository;
    }

    @Override
    public void createTransaction(TransactionFormDto form) {
        Transactions transactions = new Transactions(
                form.value(),
                form.description(),
                form.paymentMethod(),
                form.numberCard(),
                form.cardHoldName(),
                form.cardExpirationDate(),
                form.codeVerificationCard(),
                LocalDate.now()
        );

        repository.save(transactions);
    }

    @Override
    public List<Transactions> getListTransactions() {
        return repository.findAll();
    }
}
