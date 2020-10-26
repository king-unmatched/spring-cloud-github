package com.jk.controller;

import com.jk.entity.ContractBean;
import com.jk.pojo.PageResult;
import com.jk.pojo.RedisContent;
import com.jk.service.ContractService;
import com.jk.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ContractController {

    @Autowired
    private ContractService contractService;
    @Autowired
    private RedisUtil redisUtil;


    @RequestMapping("tocontract")
    public String tocontract(){
        return "contract/show";
    }

    @RequestMapping("select")
    @ResponseBody
    public PageResult select(Integer currPage, Integer pageSize,String  name){
            PageResult select = contractService.select(currPage, pageSize, name);
        return select;
    }


    @RequestMapping("insert")
    @ResponseBody
    public void insert(ContractBean contract){
        contractService.insert(contract);
    }


    @RequestMapping("del")
    @ResponseBody
    public void del(String[] id){
        contractService.del(id);
    }


    @RequestMapping("huix")
    @ResponseBody
    public ContractBean huix(Integer id){
        return contractService.huix(id);
    }


    @RequestMapping("xiu")
    @ResponseBody
    public void xiu(Integer id){
        contractService.xiu(id);
    }
}
