package org.george.storepostgrespring.controller;

import lombok.AllArgsConstructor;
import org.george.storepostgrespring.domain.model.ProductModel;
import org.george.storepostgrespring.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/store-postgres")
public class ProductController {
    final ProductService productService;

    @PostMapping("/register-product")
    public ResponseEntity<String> create(@RequestBody ProductModel product) {
       productService.create(product);
       return new ResponseEntity<>("Product created successfully.", HttpStatus.OK);
    }
}
