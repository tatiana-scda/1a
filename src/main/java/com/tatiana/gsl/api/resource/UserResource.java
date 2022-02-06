package com.tatiana.gsl.api.resource;

import com.tatiana.gsl.api.request.CreateUserRequest;
import com.tatiana.gsl.api.request.LoginRequest;
//import com.tatiana.gsl.domain.model.entity.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@CrossOrigin
@RequestMapping(path = "/v1")
public interface UserResource {

	@PostMapping(path = "/user",produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
	void createUser(@RequestBody CreateUserRequest request);

	@PostMapping(path = "/login", produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
	boolean loginUser(@RequestBody LoginRequest request);
}
