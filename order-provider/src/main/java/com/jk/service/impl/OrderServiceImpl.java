package com.jk.service.impl;

import com.jk.dao.FoodBeanMapper;
import com.jk.dao.OrderBeanMapper;
import com.jk.entity.ContractBean;
import com.jk.entity.FoodBean;
import com.jk.entity.OrderBean;
import com.jk.pojo.PageResult;
import com.jk.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderBeanMapper orderBeanMapper;
    @Autowired
    private FoodBeanMapper foodBeanMapper;

    @Override
    public PageResult select(Integer currPage, Integer pageSize) {
        Long total = orderBeanMapper.count();
        List<ContractBean> naviglist = orderBeanMapper.findPage(currPage, pageSize);
        Long totalPage = total%pageSize == 0 ? total/pageSize : (total/pageSize + 1);
        return new PageResult(total, naviglist, currPage, pageSize, totalPage);
    }

    @Override
    public void insert(OrderBean order) {
        if (order.getOrderId() == null){
            orderBeanMapper.insert(order);
        }else{
            orderBeanMapper.updateByPrimaryKeySelective(order);
        }
    }

    @Override
    public void del(String[] orderId) {
        orderBeanMapper.del(orderId);
    }

    @Override
    public OrderBean huix(Integer orderId) {
        return orderBeanMapper.selectByPrimaryKey(orderId);
    }


    @Override
    public PageResult selectfood(Integer currPage, Integer pageSize) {
        Long total = foodBeanMapper.countFood();
        List<ContractBean> naviglist = foodBeanMapper.findFoodPage(currPage, pageSize);
        Long totalPage = total%pageSize == 0 ? total/pageSize : (total/pageSize + 1);
        return new PageResult(total, naviglist, currPage, pageSize, totalPage);
    }

    @Override
    public void insertfood(FoodBean food) {
        if (food.getFoodId() == null){
            foodBeanMapper.insert(food);
        }else{
            foodBeanMapper.updateByPrimaryKeySelective(food);
        }
    }

    @Override
    public FoodBean huixfood(Integer foodId) {
        return foodBeanMapper.selectByPrimaryKey(foodId);

    }

}
