package com.homeProject.core1.controllers;

import com.homeProject.core1.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.homeProject.core1.model.User;

@RestController
@RequiredArgsConstructor
public class SomeController {
    private final UserService userService;
    @GetMapping("/hello/{id}")
    public User sayHello(@PathVariable Long id){

        return userService.getUser(id);
    }
}
