package com.jk.service;

import com.jk.entity.CostBean;
import com.jk.pojo.PageResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface CostService {
    PageResult select(Integer currPage, Integer pageSize, CostBean cost);

    void addCost(CostBean cos);

    CostBean huixian(@RequestParam  Integer id);

    void zhuangtai(Integer id, Integer status);

    void delcost(String id);
}
