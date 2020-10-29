package com.jk.controller;

import com.jk.entity.CostBean;
import com.jk.pojo.PageResult;
import com.jk.service.CostService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
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
    @RequiresPermissions("cost:query")
    public String show(){
        return "cost/show";
    }

    @RequestMapping("addCost")
    @ResponseBody
    @RequiresPermissions("cost:add")
    public void addCost(CostBean cos){
        costService.addCost(cos);
    }

    @RequestMapping("hui")
    @ResponseBody
    @RequiresPermissions("cost:update")
    public CostBean huixian(@RequestParam Integer id){
        return  costService.huixian(id);
    }

    @RequestMapping("baoxiao")
    @ResponseBody
    public void zhuangtai(Integer id, Integer status){
        costService.zhuangtai(id,status);
    }

    @RequestMapping("delete")
    @ResponseBody
    @RequiresPermissions("cost:delete")
    public void delcost(@RequestParam String id){
        costService.delcost(id);
    }
}
