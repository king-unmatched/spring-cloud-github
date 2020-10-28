package com.jk.service;

import com.jk.entity.User;

import javax.servlet.http.HttpSession;

public interface UserService {
    User login(User user);
}
