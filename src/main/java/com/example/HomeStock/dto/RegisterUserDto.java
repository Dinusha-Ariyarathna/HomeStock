package com.example.HomeStock.dto;

import lombok.Data;

/**
 * @AUTHOR : Dinusha Ariyarathna
 * @DATE : 5/2/2025
 * @PROJECT : HomeStock
 */

@Data
public class RegisterUserDto {
    private String email;

    private String password;

    private String fullName;
}
