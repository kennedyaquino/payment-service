package br.com.kennedy.psp.repositories;

import br.com.kennedy.psp.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, String> {
}
