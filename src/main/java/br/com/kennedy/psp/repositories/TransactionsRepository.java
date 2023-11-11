package br.com.kennedy.psp.repositories;

import br.com.kennedy.psp.entities.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionsRepository extends JpaRepository<Transactions, String> {
}
