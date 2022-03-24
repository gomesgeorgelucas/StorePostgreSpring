package org.george.storepostgrespring.domain.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Collection;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbl_product")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "ds_product_code")
    Long productCode;
    @Column(name = "ds_description")
    String description;
    @Column(name = "ds_unit_price")
    BigDecimal unitPrice;
    @Column(name = "ds_quantity")
    Long quantity;

    @Embedded
    CategoryModel category;

    @ManyToMany
    Collection<PurchaseModel> purchases;



}
