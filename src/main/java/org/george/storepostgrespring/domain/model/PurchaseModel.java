package org.george.storepostgrespring.domain.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.Collection;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbl_purchase")
public class PurchaseModel {

    @Id
    @Column(name = "ds_purchase_id")
    PurchasesKey purchaseId;

    @CreationTimestamp
    @Column(name = "ds_purchase_time")
    ZonedDateTime purchaseTime;
    @UpdateTimestamp
    @Column(name = "ds_purchase_updated")
    ZonedDateTime purchaseUpdated;

    @ManyToMany
    List<ProductModel> products;
}
