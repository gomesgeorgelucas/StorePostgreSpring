package org.george.storepostgrespring.domain.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Getter
@Setter
@Embeddable
public class CategoryModel {
    @Column(name = "ds_type")
    String type;


}
