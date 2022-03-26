package org.george.storepostgrespring.domain.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Getter
@Setter
@Embeddable
public class ProductCategory {
    @Column(name = "id_product_category")
    Long id;

    @Column(name = "tp_category")
    String type;


}
