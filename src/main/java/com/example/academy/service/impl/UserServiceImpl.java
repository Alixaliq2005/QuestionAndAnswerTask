package com.example.academy.service.impl;

import com.example.academy.dto.request.UserRequest;
import com.example.academy.entity.User;
import com.example.academy.repository.UserRepository;
import com.example.academy.service.inter.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public void createUser(UserRequest requestDTO) {
        User saveUser = dtoToEntity (requestDTO);
        userRepository.save (saveUser);
    }

    private User dtoToEntity(UserRequest userRequest) {
        return User.builder ()
                .firstName (userRequest.getFirstName ())
                .lastName (userRequest.getLastName ())
                .build ();
    }
}
