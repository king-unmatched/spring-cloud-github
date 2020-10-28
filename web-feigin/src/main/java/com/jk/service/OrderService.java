package com.jk.service;

import com.jk.entity.FoodBean;
import com.jk.entity.OrderBean;
import com.jk.pojo.PageResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "order-provider")
public interface OrderService {

    @RequestMapping("findOrder")
    public PageResult select(@RequestParam Integer currPage, @RequestParam Integer pageSize);

    @RequestMapping("addOrder")
    public void insert(@RequestBody OrderBean order);

    @RequestMapping("deleteOrder")
    public void del(@RequestParam String[] orderId);

    @RequestMapping("orderHX")
    public OrderBean huix(@RequestParam Integer orderId);

    @RequestMapping("findfood")
    public PageResult selectfood(@RequestParam Integer currPage, @RequestParam Integer pageSize);

    @RequestMapping("addFood")
    public void insertfood(@RequestBody FoodBean food);

    @RequestMapping("foodHX")
    public FoodBean huixfood(@RequestParam Integer foodId);

}
