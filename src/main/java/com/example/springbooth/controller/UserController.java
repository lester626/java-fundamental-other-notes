package com.example.springbootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {

    @GetMapping("/user/hello")
    public String helloUser() {
        return "hello";
    }
}
