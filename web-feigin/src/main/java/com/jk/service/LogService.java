package com.jk.service;

import com.jk.entity.LogBean;
import com.jk.pojo.PageResult;

import java.util.HashMap;

public interface LogService {

    PageResult selectlist(Integer currPage, Integer pageSize, LogBean log);

    void delete(String[] id);
}
