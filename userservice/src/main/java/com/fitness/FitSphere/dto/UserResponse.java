package com.fitness.FitSphere.dto;

import com.fitness.FitSphere.model.UserRole;
import lombok.Data;
import java.lang.Integer;

import java.time.LocalDateTime;

@Data
public class UserResponse {
    private String id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private int age;
    private UserRole role = UserRole.USER;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
