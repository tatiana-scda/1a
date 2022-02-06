package com.tatiana.gsl.api.controller;

import com.tatiana.gsl.api.response.DeliveryResponse;
import com.tatiana.gsl.api.resource.DeliveryResource;
import com.tatiana.gsl.domain.service.DeliveryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class DeliveryController implements DeliveryResource {

	private final DeliveryService service;

	/* *
	 * This endpoint will show delivery information
	 * */
	@Override
	public DeliveryResponse getDelivery(@RequestBody Integer id) {
		return service.getDelivery(id);
	}
}
