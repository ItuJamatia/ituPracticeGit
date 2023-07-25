package com.jiffy.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jiffy.payload.UserCredentials;
import com.jiffy.payload.UserDto;
import com.jiffy.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST})
    public String signin() {
        return "login";
    }

    @RequestMapping(value = "/signup", method = {RequestMethod.GET, RequestMethod.POST})
    public String signup() {
        return "signup";
    }

    @PostMapping("/signup")
    public String signup(UserDto userDto) {
        userService.signup(userDto);
        return "redirect:/booking/select-address";
    }


}

