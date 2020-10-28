package com.jk.service;

import com.jk.entity.Personnel;
import com.jk.pojo.PageResult;

public interface PersonnelService {
    PageResult listAll(Integer currPage, Integer pageSize, Personnel per);

    void addPer(Personnel per);

    void delPer(String id);

    Personnel huixian(Integer id);
}
