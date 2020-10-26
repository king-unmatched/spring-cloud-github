package com.jk.controller;

import com.jk.entity.ItemBean;
import com.jk.pojo.PageResult;
import com.jk.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @Autowired
    private ItemService ser;

    @RequestMapping("select")
    public PageResult select(Integer currPage, Integer pageSize, ItemBean item){
        return ser.select(currPage,pageSize,item);
    }
    @RequestMapping("insert")
    public String insert (ItemBean item){
        ser.insert(item);
        return "提交成功";
    }
    @RequestMapping("del")
    public String del(String[] id){
        ser.del(id);
        return "删除成功";
    }
    @RequestMapping("id")
    public ItemBean huix(Integer id){
        return ser.huix(id);
    }
}
