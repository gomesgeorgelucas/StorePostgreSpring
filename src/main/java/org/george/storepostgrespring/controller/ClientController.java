package org.george.storepostgrespring.controller;

import lombok.AllArgsConstructor;
import org.george.storepostgrespring.domain.model.ClientModel;
import org.george.storepostgrespring.service.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/store-postgres")
public class ClientController {
    final ClientService clientService;

    @PostMapping("/register-customer")
    public ResponseEntity<String> create(@RequestBody ClientModel client) {
        clientService.create(client);
        return new ResponseEntity<>("Client registered successfully.", HttpStatus.OK);
    }
}
