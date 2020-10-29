package com.jk.controller;

import com.jk.entity.FoodBean;
import com.jk.entity.OrderBean;
import com.jk.pojo.PageResult;
import com.jk.service.OrderService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("toorder")
    @RequiresPermissions("order:query")
    public String toorder(){
        return "order/show";
    }

    @RequestMapping("findOrder")
    @ResponseBody
    public PageResult select(Integer currPage, Integer pageSize){
        PageResult select = orderService.select(currPage, pageSize);
        return select;
    }

    @RequestMapping("addOrder")
    @ResponseBody
    @RequiresPermissions("order:add")
    public void insert(OrderBean order){
        orderService.insert(order);
    }


    @RequestMapping("deleteOrder")
    @ResponseBody
    @RequiresPermissions("order:delete")
    public void del(String[] orderId){
        orderService.del(orderId);
    }


    @RequestMapping("orderHX")
    @ResponseBody
    @RequiresPermissions("order:update")
    public OrderBean huix(Integer orderId){
        return orderService.huix(orderId);
    }


    @RequestMapping("findfood")
    @ResponseBody
    public PageResult selectfood(Integer currPage, Integer pageSize){
        PageResult selectfood = orderService.selectfood(currPage, pageSize);
        return selectfood;
    }

    @RequestMapping("tofood")
    public String tofood(){
        return "order/food";
    }


    @RequestMapping("addFood")
    @ResponseBody
    public void insertfood(FoodBean food){
        orderService.insertfood(food);
    }


    @RequestMapping("foodHX")
    @ResponseBody
    public FoodBean huixfood(Integer foodId){
        return orderService.huixfood(foodId);
    }
}
