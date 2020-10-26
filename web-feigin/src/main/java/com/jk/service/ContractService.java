package com.jk.service;

import com.jk.entity.ContractBean;
import com.jk.pojo.PageResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "contract-provider")
public interface ContractService {

    @RequestMapping("select")
    public PageResult select(@RequestParam Integer currPage, @RequestParam Integer pageSize, @RequestParam String  name);

    @RequestMapping("insert")
    public void insert(@RequestBody ContractBean contract);

    @RequestMapping("del")
    public void del(@RequestParam String[] id);

    @RequestMapping("huix")
    public ContractBean huix(@RequestParam Integer id);

    @RequestMapping("xiu")
    public void xiu(@RequestParam Integer id);
}
