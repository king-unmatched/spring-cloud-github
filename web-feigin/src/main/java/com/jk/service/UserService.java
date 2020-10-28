package com.jk.service;

import com.jk.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@FeignClient(value = "user-provider")
public interface UserService {

    @RequestMapping("login")
    public User login(@RequestBody User user);
}
