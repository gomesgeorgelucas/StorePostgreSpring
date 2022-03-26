package org.george.storepostgrespring.service;

import lombok.AllArgsConstructor;
import org.george.storepostgrespring.domain.model.ProductModel;
import org.george.storepostgrespring.repository.ProductRepository;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductService {
    final ProductRepository productRepository;

    public void create(ProductModel product) {
        productRepository.save(product);
    }
}
