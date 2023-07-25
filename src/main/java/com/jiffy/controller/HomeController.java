package com.jiffy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	//http://localhost:8080/jiffy/home
    @GetMapping("/home")
    public String home() {
        // Logic to handle the homepage request
        // You can return the name of the view or redirect to another URL
        return "home"; // Assuming "home" is the name of the view for the homepage
    }
}

