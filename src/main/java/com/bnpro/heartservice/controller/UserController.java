package com.bnpro.heartservice.controller;

import com.bnpro.heartservice.controller.request.RegisterRequest;
import com.bnpro.heartservice.controller.response.MobileResponse;
import com.bnpro.heartservice.service.UserService;
import com.bnpro.heartservice.service.model.UserDetail;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST, value = "/register", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody MobileResponse<UserDetail> register(@RequestBody RegisterRequest request) {

        try {
            MobileResponse<UserDetail> response = userService.register(request.getName(),request.getPassword(),request.getEmail());
            return response;
        } catch (Exception e) {
            return new MobileResponse<UserDetail>("error", e.getMessage());
        }
    }

}
