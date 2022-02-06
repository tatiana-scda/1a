package com.tatiana.gsl.domain.service;

import com.tatiana.gsl.api.response.RouteResponse;
//import com.tatiana.gsl.domain.model.entity.Address;
import com.tatiana.gsl.domain.enumerator.RouteStatus;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RouteService {

//    VehicleRepository vehicleRepository;
//
//    RouteRepository routeRepository;
//
//    AddressRepository addressRepository;

    public RouteResponse getRoute(Integer routeId) {
//        var route = routeRepository.getById(routeId);
//        var vehicle = vehicleRepository.getById(route.getVehicleId());
//        var origin = addressRepository.getById(route.getOriginId());
//        var destination = addressRepository.getById(route.getDestinationId());
//
//        var response = new RouteResponse();
//
//        response.setRouteId(routeId);
//        response.setStatus(route.getStatus());
//        response.setOrigin(constructAddress(origin));
//        response.setDestination(constructAddress(destination));
//        response.setCurrentLocation(vehicle.getCurrentLocation());
//        response.setDriver(vehicle.getDriver());

        return  new RouteResponse()
                .withRouteId(routeId)
                .withStatus(RouteStatus.IN_PROGRESS.getStatus())
                .withDriver("Pedro Martines")
                .withCurrentLocation("Rua Padre Anchieta 234 Barbacena")
                .withDestination("Rua Sergipe 10 Belo Horizonte")
                .withOrigin("Avenida Augusta 55 Sao Paulo");
    }
//
//    String constructAddress(Address address) {
//        return address.getStreet() + " " +
//                address.getNumber() + " " +
//                address.getCity();
//    }
}
