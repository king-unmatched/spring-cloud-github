package com.jk.controller;

import com.jk.entity.CostBean;
import com.jk.pojo.PageResult;
import com.jk.service.CostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CostController {
    @Autowired
    private CostService costService;

    @RequestMapping("select")
    public PageResult selectlist(@RequestParam(value="currPage",defaultValue="1")Integer currPage, @RequestParam(value="pageSize",defaultValue="3")Integer pageSize, CostBean cost){
        return costService.select(currPage,pageSize,cost);
    }

    @RequestMapping("addCost")
    public void addCost(@RequestBody CostBean cos){
        costService.addCost(cos);
    }

    @RequestMapping("huixian")
    public CostBean huixian(@RequestParam Integer id){
        return  costService.huixian(id);
    }

}
