package com.jk.controller;

import com.jk.entity.CostBean;
import com.jk.pojo.PageResult;
import com.jk.service.CostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("to")
public class CostController {
    @Autowired
    private CostService  costService;

    @RequestMapping("list")
    @ResponseBody
    public PageResult selectlist(Integer currPage,Integer pageSize,CostBean cost){
        return costService.selectlist(currPage,pageSize,cost);
    }
    @RequestMapping("show")
    public String show(){
        return "cost/show";
    }
    @RequestMapping("addCost")
    @ResponseBody
    public void addCost(CostBean cos){
        costService.addCost(cos);
    }

    @RequestMapping("hui")
    @ResponseBody
    public CostBean huixian(@RequestParam Integer id){
        return  costService.huixian(id);
    }
}
