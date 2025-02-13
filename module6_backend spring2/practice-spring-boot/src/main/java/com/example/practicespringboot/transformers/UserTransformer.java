package com.example.practicespringboot.transformers;

import com.example.practicespringboot.dtos.responses.UserResponseDto;
import com.example.practicespringboot.models.User;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UserTransformer {

    public static UserResponseDto userToResponseDto(User user) {
        return UserResponseDto.builder()
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .build();
    }
}
