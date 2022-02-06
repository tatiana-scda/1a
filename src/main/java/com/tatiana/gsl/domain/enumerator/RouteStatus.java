package com.tatiana.gsl.domain.enumerator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum RouteStatus {
    PROCESSING ("processing"),
    IN_PROGRESS ("in_progress"),
    DONE ("done");

    private String status;
}
