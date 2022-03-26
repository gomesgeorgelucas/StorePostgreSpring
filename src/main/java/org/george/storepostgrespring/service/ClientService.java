package org.george.storepostgrespring.service;

import lombok.AllArgsConstructor;
import org.george.storepostgrespring.domain.model.ClientModel;
import org.george.storepostgrespring.repository.ClientRepository;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ClientService {

    final ClientRepository clientRepository;

    public void create(ClientModel client) {
        clientRepository.save(client);
    }
}
