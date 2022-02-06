package com.tatiana.gsl.api.resource;

import com.tatiana.gsl.api.response.RouteResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequestMapping(path = "/v1/route")
public interface RouteResource {

	@GetMapping(path = "/{id}", produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
	RouteResponse getRoute(@PathVariable Integer id);
}
