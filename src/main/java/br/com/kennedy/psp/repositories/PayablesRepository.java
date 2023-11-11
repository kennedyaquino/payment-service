package br.com.kennedy.psp.repositories;

import br.com.kennedy.psp.entities.Payables;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayablesRepository extends JpaRepository<Payables, String> {
}
