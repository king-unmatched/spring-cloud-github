package com.jk.service;

import com.jk.entity.User;

import java.util.List;

public interface UserService {
    User login(String userCode);

    List<String> selectPowerKeyList(Integer id);
}
