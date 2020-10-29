package com.jk.controller;

import com.jk.entity.ContractBean;
import com.jk.pojo.PageResult;
import com.jk.pojo.RedisContent;
import com.jk.service.ContractService;
import com.jk.util.RedisUtil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("cont")
public class ContractController {

    @Autowired
    private ContractService contractService;
    @Autowired
    private RedisUtil redisUtil;


    @RequestMapping("tocontract")
    @RequiresPermissions("cont:query")
    public String tocontract(){
        return "contract/show";
    }

    @RequestMapping("find")
    @ResponseBody
    public PageResult select(Integer currPage, Integer pageSize,String  name){
            PageResult select = contractService.select(currPage, pageSize, name);
        return select;
    }


    @RequestMapping("add")
    @ResponseBody
    @RequiresPermissions("cont:add")
    public void insert(ContractBean contract){
        contractService.insert(contract);
    }


    @RequestMapping("deletee")
    @ResponseBody
    @RequiresPermissions("cont:delete")
    public void del(String[] id){
        contractService.del(id);
    }


    @RequestMapping("contractHX")
    @ResponseBody
    @RequiresPermissions("cont:update")
    public ContractBean huix(Integer id){
        return contractService.huix(id);
    }


    @RequestMapping("updateContract")
    @ResponseBody
    public void xiu(Integer id){
        contractService.xiu(id);
    }
}
