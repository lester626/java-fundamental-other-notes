package com.example.springbootthymeleaf.controller;

import com.example.springbootthymeleaf.exceptions.SdaException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThrowingController {
    @GetMapping("/boom")
    public String shouldThrow() {
        throw new SdaException("Something went wrong...");
    }
}
