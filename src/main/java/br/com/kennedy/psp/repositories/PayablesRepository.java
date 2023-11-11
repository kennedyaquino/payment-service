package br.com.kennedy.psp.repositories;

import br.com.kennedy.psp.entities.Payables;
import br.com.kennedy.psp.entities.StatusPayable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PayablesRepository extends JpaRepository<Payables, String> {

    List<Payables> findAllByStatusPayable(StatusPayable status);
}
