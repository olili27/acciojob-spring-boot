package com.example.practicespringboot.services.implementations;

import com.example.practicespringboot.dtos.responses.UserResponseDto;
import com.example.practicespringboot.models.User;
import com.example.practicespringboot.repositories.UserRepository;
import com.example.practicespringboot.services.interfaces.UserService;
import com.example.practicespringboot.transformers.UserTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<UserResponseDto> getAllUsers() {

        List<User> users = userRepository.findAll();
        List<UserResponseDto> userResponseDtos = new ArrayList<>();

        for (User user: users) {
            UserResponseDto userResponseDto = UserTransformer.userToResponseDto(user);
            userResponseDtos.add(userResponseDto);
        }

        return userResponseDtos;
    }
}
