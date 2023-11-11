package br.com.kennedy.psp.services;

import br.com.kennedy.psp.entities.Client;
import br.com.kennedy.psp.entities.Transactions;
import br.com.kennedy.psp.entities.dto.TransactionFormDto;
import br.com.kennedy.psp.exceptions.NotFoundException;
import br.com.kennedy.psp.repositories.ClientRepository;
import br.com.kennedy.psp.repositories.TransactionsRepository;
import br.com.kennedy.psp.usescases.ICreateTransactionUseCase;
import br.com.kennedy.psp.usescases.IListTransactionsUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TransactionService implements ICreateTransactionUseCase, IListTransactionsUseCase {

    private TransactionsRepository repository;
    private ClientRepository clientRepository;

    @Autowired
    public TransactionService(TransactionsRepository repository, ClientRepository clientRepository) {
        this.repository = repository;
        this.clientRepository = clientRepository;
    }

    @Override
    public void createTransaction(TransactionFormDto form) {

        Client client = clientRepository.findById(form.idClient()).orElseThrow(() -> new NotFoundException("Not found client id"));

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

        transactions.setClient(client);

        repository.save(transactions);
    }

    @Override
    public List<Transactions> getListTransactions() {
        return repository.findAll();
    }
}
