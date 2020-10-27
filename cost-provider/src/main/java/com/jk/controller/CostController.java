package com.jk.controller;

import com.jk.entity.CostBean;
import com.jk.pojo.PageResult;
import com.jk.service.CostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CostController {
    @Autowired
    private CostService costservice;

    @RequestMapping("list")
    public PageResult selectlist(@RequestParam Integer currPage, @RequestParam Integer pageSize,@RequestBody CostBean cost){
        return costservice.select(currPage,pageSize,cost);
    }

    @RequestMapping("addCost")
    public void addCost(@RequestBody CostBean cos){
        costservice.addCost(cos);
    }

    @RequestMapping("huixian")
    public CostBean huixian(@RequestParam Integer id){
        return  costservice.huixian(id);
    }
    @RequestMapping("zhuangtai")
    public void zhuangtai(@RequestParam Integer id,@RequestParam Integer status){
        costservice.zhuangtai(id,status);
    }
}
