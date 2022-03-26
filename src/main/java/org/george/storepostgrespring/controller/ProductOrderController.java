package org.george.storepostgrespring.controller;

import lombok.AllArgsConstructor;
import org.george.storepostgrespring.domain.dto.ProductOrderDTO;
import org.george.storepostgrespring.domain.model.ProductModel;
import org.george.storepostgrespring.domain.model.ProductOrderModel;
import org.george.storepostgrespring.service.ProductOrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/store-postgres")
public class ProductOrderController {
    final ProductOrderService productOrderService;

    @PostMapping("/register-order")
    public ResponseEntity<String> create(@RequestBody ProductOrderDTO orderDTO) {
        productOrderService.create(orderDTO);
        return new ResponseEntity<>("Order placed successfully.", HttpStatus.OK);
    }
}
