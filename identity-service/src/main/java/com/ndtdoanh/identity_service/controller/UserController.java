package com.ndtdoanh.identity_service.controller;

import com.ndtdoanh.identity_service.dto.request.UserCreationRequest;
import com.ndtdoanh.identity_service.entity.User;
import com.ndtdoanh.identity_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/users")
    User createUser(@RequestBody UserCreationRequest request) {
        return userService.createUser(request);
    }
}
