package com.example.springbootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(final ModelMap modelMap) {
        modelMap.addAttribute("helloMsg", "Hello Edited World");
        return "welcome";
    }
}
