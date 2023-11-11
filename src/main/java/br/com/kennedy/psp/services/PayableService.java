package br.com.kennedy.psp.services;

import br.com.kennedy.psp.entities.Payables;
import br.com.kennedy.psp.entities.PaymentMethod;
import br.com.kennedy.psp.entities.StatusPayable;
import br.com.kennedy.psp.entities.Transactions;
import br.com.kennedy.psp.repositories.PayablesRepository;
import br.com.kennedy.psp.usescases.ICreatePayables;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

public class PayableService implements ICreatePayables {

    private PayablesRepository repository;

    @Autowired
    public PayableService(PayablesRepository repository) {
        this.repository = repository;
    }

    @Override
    public void createPayables(Transactions transactions) {

        Payables payables = new Payables();

       if(transactions.getPaymentMethod().equals(PaymentMethod.DEBIT_CARD)) {
           double rate = 0.03;
           payables.setStatusPayable(StatusPayable.PAID);
           payables.setFee(rate);
           payables.setValue(transactions.getValue().subtract(transactions.getValue().multiply(new BigDecimal(rate))));
           payables.setPaymentDate(transactions.getTransactionDate());
       } else {
           double rate = 0.05;
           payables.setStatusPayable(StatusPayable.WAITING_FUNDS);
           payables.setFee(rate);
           payables.setValue(transactions.getValue().subtract(transactions.getValue().multiply(new BigDecimal(rate))));
           payables.setPaymentDate(transactions.getTransactionDate().plusDays(30));
       }

       repository.save(payables);
    }
}
