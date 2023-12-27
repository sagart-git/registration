package com.example.registration.api;

import com.example.registration.dto.UserDTO;
import com.example.registration.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("registration")
public class RegistrationAPI {

    @Autowired
    RegistrationService registrationService;
    @PostMapping
    public String registerUser(@RequestBody UserDTO userDTO){
        registrationService.register(userDTO);
        return "User registered successfully!!";
    }

    @GetMapping
    public String registerUser(){
        return "User registered successfully!!";
    }
}
