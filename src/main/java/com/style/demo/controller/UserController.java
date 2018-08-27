package com.style.demo.controller;

import com.style.demo.entity.User;
import com.style.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/all")
    @ResponseBody
    public List<User>  findAllUser(){

        return userService.findAllUser();
    }
}
