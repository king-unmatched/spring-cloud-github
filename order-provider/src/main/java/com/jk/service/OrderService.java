package com.jk.service;

import com.jk.entity.FoodBean;
import com.jk.entity.OrderBean;
import com.jk.pojo.PageResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface OrderService {

    PageResult select(@RequestParam Integer currPage, @RequestParam Integer pageSize);

    void insert(@RequestBody OrderBean order);

    void del(@RequestParam String[] orderId);

    OrderBean huix(@RequestParam Integer orderId);

    PageResult selectfood(@RequestParam Integer currPage, @RequestParam Integer pageSize);

    void insertfood(@RequestBody FoodBean food);

    FoodBean huixfood(@RequestParam Integer foodId);
}
