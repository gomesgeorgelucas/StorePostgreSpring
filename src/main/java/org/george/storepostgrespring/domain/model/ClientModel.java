package org.george.storepostgrespring.domain.model;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbl_client")
public class ClientModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_client")
    Long id;

    @Column(name = "nm_client")
    String name;

    @ManyToMany
    @JoinTable(
            name = "tbl_client_orders",
            joinColumns = @JoinColumn(name="id_client"),
            inverseJoinColumns = @JoinColumn(name = "id_order")
    )
    Collection<ProductOrderModel> orders;
}
