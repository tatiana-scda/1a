package com.tatiana.gsl.api.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;

@AllArgsConstructor
@NoArgsConstructor
@Data
@With
public class RouteResponse {

    Integer routeId;

    String status;

    String driver;

    String currentLocation;

    String origin;

    String destination;
}
