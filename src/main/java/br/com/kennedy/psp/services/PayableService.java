package br.com.kennedy.psp.services;

import br.com.kennedy.psp.entities.*;
import br.com.kennedy.psp.repositories.ClientRepository;
import br.com.kennedy.psp.repositories.PayablesRepository;
import br.com.kennedy.psp.usescases.ICreatePayablesUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PayableService implements ICreatePayablesUseCase {

    private PayablesRepository repository;
    private ClientRepository clientRepository;

    @Autowired
    public PayableService(PayablesRepository repository, ClientRepository clientRepository) {
        this.repository = repository;
        this.clientRepository = clientRepository;
    }

    @Override
    public void createPayables(Transactions transactions) {

        Payables payables = new Payables();
        Client client = transactions.getClient();

       if(transactions.getPaymentMethod().equals(PaymentMethod.DEBIT_CARD)) {
           double rate = 0.03;
           payables.setStatusPayable(StatusPayable.PAID);
           payables.setFee(rate);
           payables.setValue(transactions.getValue().subtract(transactions.getValue().multiply(new BigDecimal(rate))));
           payables.setPaymentDate(transactions.getTransactionDate());

           client.getBalancePaid().add(payables.getValue());
           clientRepository.save(client);
           payables.setClient(transactions.getClient());

       } else {
           double rate = 0.05;
           payables.setStatusPayable(StatusPayable.WAITING_FUNDS);
           payables.setFee(rate);
           payables.setValue(transactions.getValue().subtract(transactions.getValue().multiply(new BigDecimal(rate))));
           payables.setPaymentDate(transactions.getTransactionDate().plusDays(30));


           client.getBalanceWaitingFunds().add(payables.getValue());
           clientRepository.save(client);
           payables.setClient(transactions.getClient());
       }

       repository.save(payables);
    }
}
