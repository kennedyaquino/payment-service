package br.com.kennedy.psp.services;

import br.com.kennedy.psp.entities.Client;
import br.com.kennedy.psp.repositories.ClientRepository;
import br.com.kennedy.psp.services.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository repository) {
        this.clientRepository = repository;
    }

    public Client FindById(String id) {
        return clientRepository.findById(id).orElseThrow(() -> new NotFoundException("not found client id"));
    }
}
