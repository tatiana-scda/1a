package com.tatiana.gsl.api.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CreateUserRequest {

    String name;

    String username;

    String password;
}
