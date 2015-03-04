package com.bnpro.heartservice.controller;

import com.bnpro.heartservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public String register() {
        return userService.register();
    }

}
