package com.tatiana.gsl.domain.service;

import com.google.common.hash.Hashing;
import com.tatiana.gsl.api.request.CreateUserRequest;
import com.tatiana.gsl.api.request.LoginRequest;
//import com.tatiana.gsl.domain.model.entity.User;
//import com.tatiana.gsl.domain.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;

@Service
@AllArgsConstructor
public class UserService {

//    UserRepository repository;

    public void saveUser(CreateUserRequest request) {

//        var user = new User();
//
//        user.setUsername(request.getUsername());
//        user.setName(request.getName());
//        user.setPassword(securePassword(request.getPassword()));

//        repository.save(user);
    }

    public boolean loginUser(LoginRequest request) {
//        var user = repository
//                .findByUsernameAndPassword(request.getUsername(), securePassword(request.getPassword()));

        return true;
    }

    String securePassword(String password) {
        return Hashing.sha256()
                .hashString(password, StandardCharsets.UTF_8)
                .toString();
    }
}
