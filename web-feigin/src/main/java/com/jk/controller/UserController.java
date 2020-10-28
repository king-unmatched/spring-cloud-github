package com.jk.controller;

import com.jk.entity.User;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("login")
    @ResponseBody
    public String login(HttpSession session, User user){
        User user1= userService.login(user);
        if(user1==null){
            return "账号不存在";
        }
        if(!user1.getUserPassword().equals(user.getUserPassword())){
            return "密码不正确";
        }
        session.setAttribute("user", user1);
        return "登录成功";
    }
    @RequestMapping("toshow")
    public String toshow(){
        return "index";
    }
}
