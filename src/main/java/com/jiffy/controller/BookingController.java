package com.jiffy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jiffy.entity.ServiceEntity;
import com.jiffy.payload.UserCredentials;
import com.jiffy.service.BookingService;
import com.jiffy.service.UserService;

@Controller
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    private UserService userService;

    @Autowired
    private BookingService bookingService;

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("credentials", new UserCredentials());
        return "redirect:/booking/select-address";
    }

    @PostMapping("/verifylogin")
    public String authenticate(UserCredentials credentials) {
        // Authenticate user
        if (userService.authenticateUser(credentials.getEmail(), credentials.getPassword())) {
            return "redirect:/booking/select-address";
        } else {
            return "login";
        }
    }}

//    @GetMapping("/select-address")
//    public String selectService(Model model) {
// 
//        List<ServiceEntity> services = bookingService.getAvailableServices();
//        model.addAttribute("services", services);
//        model.addAttribute("bookingRequest", new BookingRequest());
//        return "select-service";
//    }
//
//    @PostMapping("/book-service")
//    public String bookService(BookingRequest bookingRequest) {
//        // Perform booking process
//        bookingService.bookService(bookingRequest);
//        return "booking-success";
//    }


