package com.tatiana.gsl.api.controller;

import com.tatiana.gsl.api.request.CreateUserRequest;
import com.tatiana.gsl.api.request.LoginRequest;
import com.tatiana.gsl.api.resource.UserResource;
import com.tatiana.gsl.domain.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController implements UserResource {

	private final UserService service;

	/* *
	 * This endpoint will create user
	 * */
	@Override
	public void createUser(@RequestBody CreateUserRequest request) {
		service.saveUser(request);
	}

	/* *
	 * This endpoint will log in user
	 * */
	@Override
	public boolean loginUser(@RequestBody LoginRequest request) {
		return service.loginUser(request);
	}
}
