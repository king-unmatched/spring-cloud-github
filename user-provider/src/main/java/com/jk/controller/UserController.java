package com.jk.controller;

import com.jk.entity.User;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public User login(@RequestParam String userCode){
        return  userService.login(userCode);
    }
    @RequestMapping("selectPowerKeyList")
    public List<String> selectPowerKeyList(@RequestParam Integer id){
        return userService.selectPowerKeyList(id);
    }
}
