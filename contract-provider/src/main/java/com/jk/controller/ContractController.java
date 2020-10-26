package com.jk.controller;

import com.jk.entity.ContractBean;
import com.jk.pojo.PageResult;
import com.jk.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContractController {
    @Autowired
    private ContractService contractService;

    @RequestMapping("select")
    public PageResult select(@RequestParam Integer currPage, @RequestParam Integer pageSize, @RequestParam String  name){
        return contractService.select(currPage,pageSize,name);
    }

    @RequestMapping("insert")
    public void insert(@RequestBody ContractBean contract){
        contractService.insert(contract);
    }


    @RequestMapping("del")
    public void del(@RequestParam String[] id){
        contractService.del(id);
    }


    @RequestMapping("huix")
    public ContractBean huix(@RequestParam Integer id){
        return contractService.huix(id);
    }


    @RequestMapping("xiu")
    public void xiu(@RequestParam Integer id){
        contractService.xiu(id);
    }
}
