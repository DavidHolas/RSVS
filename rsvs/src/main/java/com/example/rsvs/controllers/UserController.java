package com.example.rsvs.controllers;

import com.example.rsvs.model.User;
import com.example.rsvs.model.UserResource;
import com.example.rsvs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    User admin = new User("admin", "admin@rsvs.com", "pass");
    private List<User> users = new ArrayList();

    @GetMapping("/getAllUsers")
    public List<UserResource> getUsers() {

        List<UserResource> users = userService.getAllUsers();

        return users;
    }

    @GetMapping("/deleteUser/{userId}")
    public void deleteUser(@PathVariable("userId") int userId) {

        userService.deleteUser(userId);
    }

    @PostMapping("/addUser")
    public void addUser(@RequestBody UserResource userResource) {

       //users.add(userResource)
    }

    @PutMapping("/updateUser")
    public void updateUser(@RequestBody UserResource userResource) {

        //userService.updateUser(userResource);
    }
}
