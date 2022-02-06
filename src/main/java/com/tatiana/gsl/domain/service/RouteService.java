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

        if(routeId == 404) {
            return  new RouteResponse();
        }

        if(routeId == 500) {
            return  null;
        }

        if(routeId == 3) {
            return  new RouteResponse()
                    .withRouteId(routeId.toString())
                    .withStatus(RouteStatus.DONE.getStatus())
                    .withDriver("Ana Martines")
                    .withCurrentLocation("Rua Rio de Janeiro 234 Rio de Janeiro")
                    .withDestination("Rua Belo Horizonte 10 Belo Horizonte")
                    .withOrigin("Avenida Sao Paulo 55 Sao Paulo");
        }

        if(routeId == 2) {
            return  new RouteResponse()
                    .withRouteId(routeId.toString())
                    .withStatus(RouteStatus.PROCESSING.getStatus())
                    .withDriver("Ricardo Martines")
                    .withCurrentLocation("Rua Campo Grande 234 Campo Grande")
                    .withDestination("Rua Rio Branco 10 Rio Branco")
                    .withOrigin("Avenida Pelotas 55 Pelotas");
        }

        return  new RouteResponse()
                .withRouteId(routeId.toString())
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
