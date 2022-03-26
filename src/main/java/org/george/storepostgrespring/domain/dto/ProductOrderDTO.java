package org.george.storepostgrespring.domain.dto;

import lombok.*;

import java.util.Collection;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductOrderDTO {
    Long clientId;
    Collection<Long> productIdList;

}
