package com.airbnl.dbcontrollerservice.controller;

import com.airbnl.dbcontrollerservice.model.User;
import com.airbnl.dbcontrollerservice.service.interfaces.IUserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getByUsername")
    User getUserByUserName(@RequestParam("username") String username) {
        return userService.getUserByUserName(username);
    }

    @GetMapping("/getUserByUserId")
    User getUserByUserId(@RequestParam("userId") long userId) {
        return userService.getUserByUserId(userId);
    }

    @PostMapping("/save")
    User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
}
