package com.tatiana.gsl.api.resource;

import com.tatiana.gsl.api.response.RouteResponse;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@CrossOrigin
@RequestMapping(path = "/")
public interface HealthResource {

	@GetMapping
	String getStatus();
}
