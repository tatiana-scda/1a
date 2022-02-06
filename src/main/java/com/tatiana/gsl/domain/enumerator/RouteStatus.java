package com.tatiana.gsl.domain.enumerator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum RouteStatus {
    PROCESSING ("PROCESSING"),
    IN_PROGRESS ("IN_PROGRESS"),
    DONE ("DONE");

    private String status;
}
