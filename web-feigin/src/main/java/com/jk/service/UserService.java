package com.jk.service;

import com.jk.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "user-provider")
public interface UserService {

    @RequestMapping("login")
    public User login(@RequestParam String userCode);

    @RequestMapping("selectPowerKeyList")
    public List<String> selectPowerKeyList(@RequestParam Integer id);
}
