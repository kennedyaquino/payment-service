package br.com.kennedy.psp.controllers;

import br.com.kennedy.psp.entities.Transactions;
import br.com.kennedy.psp.entities.dto.TransactionFormDto;
import br.com.kennedy.psp.services.PayableService;
import br.com.kennedy.psp.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    private TransactionService transactionService;
    private PayableService payableService;

    @Autowired
    public TransactionController(TransactionService transactionService, PayableService payableService) {
        this.transactionService = transactionService;
        this.payableService = payableService;
    }

    @GetMapping()
    public ResponseEntity<List<Transactions>> getList() {
        return ResponseEntity.ok(transactionService.getListTransactions());
    }

    @PostMapping()
    public ResponseEntity<Void> createTransaction(@RequestBody TransactionFormDto form) {
        payableService.createPayables(transactionService.createTransaction(form));
        return ResponseEntity.ok().build();
    }
}
