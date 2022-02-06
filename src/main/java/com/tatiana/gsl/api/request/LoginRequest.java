package com.tatiana.gsl.api.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class LoginRequest {

    String username;

    String password;
}
