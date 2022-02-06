package com.tatiana.gsl.domain.enumerator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DeliveryStatus {
    DEBT("DEBT"),
    PAID("PAID"),
    ON_ROUTE("ON_ROUTE"),
    DELIVERED("DELIVERED");

    private String status;
}