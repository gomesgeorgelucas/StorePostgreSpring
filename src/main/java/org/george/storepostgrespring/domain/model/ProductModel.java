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
    @Column(name = "id_product")
    Long id;

    @Column(name = "nm_product")
    String name;
    @Column(name = "ds_product")
    String description;
    @Column(name = "up_product")
    BigDecimal unitPrice;
    @Column(name = "qty_product")
    Long quantity;

    @ManyToMany
    @JoinTable(
            name = "tbl_product_orders",
            joinColumns = @JoinColumn(name="id_product"),
            inverseJoinColumns = @JoinColumn(name = "id_order")
    )
    Collection<ProductOrderModel> orders;

    @Embedded
    ProductCategory category;



}
