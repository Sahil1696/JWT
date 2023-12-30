package com.example.JWT.controller;

import com.example.JWT.model.User;
import com.example.JWT.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    UserService userService;
    @GetMapping("/")
    public List<User> getUser(){
        return this.userService.getAllUser();
    }

    @GetMapping("/current-user")
    public String getCurrentUser(Principal principal){
        return principal.getName();
    }
}
