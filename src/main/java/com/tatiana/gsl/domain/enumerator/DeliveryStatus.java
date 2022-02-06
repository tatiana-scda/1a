package com.tatiana.gsl.domain.enumerator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DeliveryStatus {
    PROCESSING_PAYMENT ("processing_payment"),
    PAYMENT_DONE("payment_done"),
    ON_ROUTE("on_route"),
    RECEIVED("received");

    private String status;
}
