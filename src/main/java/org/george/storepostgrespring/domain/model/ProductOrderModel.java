package org.george.storepostgrespring.domain.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.Collection;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbl_order")
public class ProductOrderModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order")
    Long id;

    @CreationTimestamp
    @Column(name = "time_order")
    ZonedDateTime orderTime;
    @UpdateTimestamp
    @Column(name = "updated_order")
    ZonedDateTime orderUpdated;

    @ManyToMany
    @JoinTable(
            name = "tbl_product_orders",
            joinColumns = @JoinColumn(name="id_order"),
            inverseJoinColumns = @JoinColumn(name = "id_product")
    )
    Collection<ProductModel> products;

    @ManyToMany
    @JoinTable(
            name = "tbl_client_orders",
            joinColumns = @JoinColumn(name="id_order"),
            inverseJoinColumns = @JoinColumn(name = "id_client")
    )
    Collection<ClientModel> clients;
}
