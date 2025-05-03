package com.example.HomeStock.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @AUTHOR : Dinusha Ariyarathna
 * @DATE : 5/1/2025
 * @PROJECT : HomeStock
 */
@RestController
public class WelcomeController {

    @GetMapping("/greeting")
    public String greeting(Authentication authentication) {
        String userName = authentication.getName();
        return "Spring Security Basic Authentication Example - Welcome " + userName;
    }


}
