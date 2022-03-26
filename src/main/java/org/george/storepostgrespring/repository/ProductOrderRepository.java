package org.george.storepostgrespring.repository;

import org.george.storepostgrespring.domain.model.ProductOrderModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductOrderRepository extends JpaRepository<ProductOrderModel, Long> {
}
