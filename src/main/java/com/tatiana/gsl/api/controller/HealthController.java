package com.tatiana.gsl.api.controller;

import com.tatiana.gsl.api.resource.HealthResource;
import com.tatiana.gsl.api.resource.RouteResource;
import com.tatiana.gsl.api.response.RouteResponse;
import com.tatiana.gsl.domain.service.RouteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class HealthController implements HealthResource {

	/* *
	 * This endpoint will show app information
	 * */
	@Override
	public String getStatus() {
		return "It's alive!";
	}
}
