//package com.jiffy.controller;
//
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.*;
//
//import com.jiffy.Repository.AddressRepository;
//import com.jiffy.entity.Address;
//import com.jiffy.payload.SignUpDTO;
//import com.jiffy.service.SignUpService;
//
//@Controller
//public class SignUpController {
//
//@Autowired	
//private SignUpService signUpService;
//
//@Autowired
//private AddressRepository addressRepo;
//
////http://localhost:8080/api/jiffy/signup
//@RequestMapping("/signup")
//public String showSignUpPage() {
//return "signup";
//}
////http://localhost:8080/api/jiffy/signup
//@RequestMapping("/home")
//public String homePage() {
//return "home";
//}
//@PostMapping("/signup")
//public String handleSignUpForm(SignUpDTO signUpDTO,Model model) {
//	signUpService.handleSignUpForm(signUpDTO);
//	model.addAttribute("msg", "Thank You for signing up!"
//			+ " Please Login with your registered email Id and password.");
//return "login";
//}
////http://localhost:8080/api/jiffy/login
//@RequestMapping("/login")
//public String showLoginInPage() {
//return "login";
//}
//@RequestMapping("/verifyLoginCredentials")
//public String verifyLoginCredentials(@RequestParam("email") String email,
//									@RequestParam("password") String password) {
//	
//	signUpService.verifyLoginCredentials(email,password);
//return "explore_services";
//}
//@RequestMapping("/cleaning")
//public String cleaning() {
//return "cleaning";
//}
//@RequestMapping("/grill")
//public String grill() {
//return "grill";
//}
//@RequestMapping("/verifyAddress")
//public String verifyAddress(@RequestParam("address") String address,ModelMap model) {
//	Optional<Address> findByAddress = addressRepo.findByAddress(address);
//	Address add = findByAddress.get();
//	model.addAttribute("add",add);
//return "booking";
//}
//@RequestMapping("/payment")
//public String payment(ModelMap model) {
//	
//return "payment";
//}
//}
