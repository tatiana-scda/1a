package com.tatiana.gsl.api.resource;

import com.tatiana.gsl.api.response.DeliveryResponse;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@CrossOrigin
@RequestMapping(path = "/v1/delivery")
public interface DeliveryResource {

	@GetMapping(path = "/{id}", produces = APPLICATION_JSON_VALUE)
	DeliveryResponse getDelivery(@PathVariable Integer id);
}
