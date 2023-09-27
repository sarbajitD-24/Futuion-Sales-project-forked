package com.myfuturehub.futuionsales.controller;

import com.myfuturehub.futuionsales.configuration.jwtconfig.JwtService;
import com.myfuturehub.futuionsales.dto.AppResponse;
import com.myfuturehub.futuionsales.dto.AuthRequest;
import com.myfuturehub.futuionsales.entity.User;
import com.myfuturehub.futuionsales.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user/")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private JwtService jwtService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @GetMapping("/home")
    @PreAuthorize("hasAuthority('admin')")
    public String home(){
        return "Hello , Welcome to Futuion Sales App";
    }



    @PostMapping("/signup")
    public AppResponse addNewUser(@RequestBody User user) {
        if(user != null){
            User userResponse = userService.addUser(user);
            if(userResponse != null){
                return new AppResponse(HttpStatus.OK, null, "user added successfully",null);
            }else {
                return new AppResponse(HttpStatus.ALREADY_REPORTED, null, "user already exist. Please login to Your account", user);
            }
        }
        return new AppResponse(HttpStatus.BAD_REQUEST);
    }


    @PostMapping("/login")
    public AppResponse authenticateAndGetToken(@RequestBody AuthRequest authRequest) {
        if(authRequest != null){
            Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword()));
            if (authentication.isAuthenticated()) {
                String token = jwtService.generateToken(authRequest.getUserName());
                return  new AppResponse(HttpStatus.OK, token, "Logged in", null);
            } else {
                return new AppResponse(HttpStatus.NOT_FOUND, null, "Email or password is incorrect", authRequest);
            }
        }
        return new AppResponse(HttpStatus.BAD_REQUEST);
    }
}
