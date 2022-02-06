//package com.tatiana.gsl.domain.service;
//
////import com.tatiana.gsl.domain.repository.UserRepository;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@ExtendWith(MockitoExtension.class)
//public class UserServiceTest {
//
//    private UserService userService;
//
//    @Mock
//    private UserRepository userRepository;
//
//    @BeforeEach
////    void setUp() {
////        userService = new UserService(userRepository);
////    }
//
//    @Test
//    void checkPassword() {
//        var pass = "123";
//        var hash = "a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3";
//
//        var secured = userService.securePassword(pass);
//
//        assertEquals(hash, secured);
//    }
//}
