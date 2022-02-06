package com.tatiana.gsl.api.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RouteResponse {

    Integer routeId;

    String status;

    String driver;

    String currentLocation;

    String origin;

    String destination;
}
