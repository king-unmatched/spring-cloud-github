package com.jk.controller;

import com.jk.entity.FoodBean;
import com.jk.entity.OrderBean;
import com.jk.pojo.PageResult;
import com.jk.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;


    @RequestMapping("findOrder")
    public PageResult select(@RequestParam Integer currPage, @RequestParam Integer pageSize){
        return orderService.select(currPage,pageSize);
    }


    @RequestMapping("addOrder")
    public void insert(@RequestBody OrderBean order){
        orderService.insert(order);
    }


    @RequestMapping("deleteOrder")
    public void del(@RequestParam String[] orderId){
        orderService.del(orderId);
    }


    @RequestMapping("orderHX")
    public OrderBean huix(@RequestParam Integer orderId){
        return orderService.huix(orderId);
    }


    @RequestMapping("findfood")
    public PageResult selectfood(@RequestParam Integer currPage, @RequestParam Integer pageSize){
        return orderService.selectfood(currPage,pageSize);
    }


    @RequestMapping("addFood")
    public void insertfood(@RequestBody FoodBean food){
        orderService.insertfood(food);
    }


    @RequestMapping("foodHX")
    public FoodBean huixfood(@RequestParam Integer foodId){
        return orderService.huixfood(foodId);
    }
}
