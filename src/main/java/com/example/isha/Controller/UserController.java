package com.example.isha.Controller;

import com.example.isha.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/api/signup")
    public String signup( @RequestParam String name,
                         @RequestParam String email, @RequestParam String pass){
       String result = userService.signup( name, email, pass);
        return result;
    }

    @GetMapping("/api/check/email")
    public String checkEmail(@RequestParam String email){
        String result = userService.checkEmail(email);
        return result;
    }

}
