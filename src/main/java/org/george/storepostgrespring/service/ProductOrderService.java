package org.george.storepostgrespring.service;

import lombok.AllArgsConstructor;
import org.george.storepostgrespring.domain.dto.ProductOrderDTO;
import org.george.storepostgrespring.domain.model.ClientModel;
import org.george.storepostgrespring.domain.model.ProductModel;
import org.george.storepostgrespring.domain.model.ProductOrderModel;
import org.george.storepostgrespring.repository.ClientRepository;
import org.george.storepostgrespring.repository.ProductOrderRepository;
import org.george.storepostgrespring.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;


@AllArgsConstructor
@Service
public class ProductOrderService {
    final ProductOrderRepository productOrderRepository;
    final ProductRepository productRepository;
    final ClientRepository clientRepository;


    public void create(ProductOrderDTO orderDTO) {
        Collection<ClientModel> clients = new ArrayList<>();
        clients.add(getClientById(orderDTO.getClientId()).get());
        Collection<ProductModel> products = new ArrayList<>();
        products.addAll(getProductsById(orderDTO.getProductIdList()));

        ProductOrderModel order = ProductOrderModel.builder()
                .clients(clients)
                .products(products)
                .build();

        productOrderRepository.save(order);
    }

    private Collection<ProductModel> getProductsById(Collection<Long> productIds) {
        return productRepository.findAllById(productIds);
    }

    private Optional<ClientModel> getClientById(Long clientId) {
        return clientRepository.findById(clientId);
    }
}
