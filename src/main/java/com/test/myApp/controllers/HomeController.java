package com.test.myApp.controllers;

import com.test.myApp.models.User;
import com.test.myApp.services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {
    @Autowired
    private HomeService homeService;

    @RequestMapping(method = RequestMethod.GET, value = "/hi")
    public String sayHi() {
        return "Hi";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/users")
    public List<User> userList() {
        return homeService.getAllUsers();
    }

    @RequestMapping("/users")
    public List<User> users() {
        return homeService.getAllUsers();
    }


    @RequestMapping("/user/{id}")
    public User getTopic(@PathVariable int id) {
        return homeService.getUser(id);

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteUser/{id}")
    public List<User> deleteUser(@PathVariable int id) {
        return homeService.deleteUser(id);

    }

    @RequestMapping(method = RequestMethod.POST, value = "/addUser")
    public List<User> addUser(@RequestBody User user) {
        return homeService.saveUser(user);

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/updateUser")
    public List<User> updateUser(@RequestBody User user) {
        return homeService.updateUser(user);
    }


    @RequestMapping(method = RequestMethod.GET,value = "/userList")
    public String userList(Model model){
        model.addAttribute("message","Welcome to Spring BOOT!!!");
        return "users";
    }
}
