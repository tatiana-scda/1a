package com.tatiana.gsl.api.controller;

import com.tatiana.gsl.api.resource.DeliveryResource;
import com.tatiana.gsl.api.resource.RouteResource;
import com.tatiana.gsl.api.response.DeliveryResponse;
import com.tatiana.gsl.api.response.RouteResponse;
import com.tatiana.gsl.domain.service.DeliveryService;
import com.tatiana.gsl.domain.service.RouteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class RouteController implements RouteResource {

	private final RouteService service;

	/* *
	 * This endpoint will show route information
	 * */
	@Override
	public RouteResponse getRoute(@RequestBody Integer id) {
		return service.getRoute(id);
	}
}
