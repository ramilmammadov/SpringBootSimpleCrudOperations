package com.test.myApp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @RequestMapping("/notsecuredlink")
    public String sayHi(){
        return "Hi";
    }

    @RequestMapping("/securedlink")
    public String saySecured(){
        return "Secured";
    }

    @RequestMapping("/protectedByUserRole")
    public String helloUser(){
        return "Hello User Role";
    }

    @RequestMapping("/protectedByAdminRole")
    public String helloAdmin(){
        return "Hello Admin Role";
    }
}