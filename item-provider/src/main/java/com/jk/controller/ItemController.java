package com.jk.controller;

import com.jk.entity.ItemBean;
import com.jk.pojo.PageResult;
import com.jk.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @Autowired
    private ItemService ser;

    @RequestMapping("select")
    public PageResult select(@RequestParam Integer currPage,@RequestParam Integer pageSize,@RequestBody ItemBean item){
        return ser.select(currPage,pageSize,item);
    }
    @RequestMapping("insert")
    public void insert (@RequestBody ItemBean item){
        ser.insert(item);
    }
    @RequestMapping("del")
    public void del(@RequestBody String[] id){
        ser.del(id);
    }
    @RequestMapping("id")
    public ItemBean huix(@RequestParam Integer id){
        return ser.huix(id);
    }
}
