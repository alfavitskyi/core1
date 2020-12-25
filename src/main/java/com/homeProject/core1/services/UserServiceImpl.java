package com.homeProject.core1.services;

import com.homeProject.core1.model.User;
import com.homeProject.core1.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    @Override
    public User getUser(Long id) {
        return userRepository.findById(id).get();
    }



}
