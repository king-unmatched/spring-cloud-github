package com.jk.service;

import com.jk.entity.ContractBean;
import com.jk.pojo.PageResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "contract-provider")
public interface ContractService {

    @RequestMapping("find")
    public PageResult select(@RequestParam Integer currPage, @RequestParam Integer pageSize, @RequestParam String  name);

    @RequestMapping("add")
    public void insert(@RequestBody ContractBean contract);

    @RequestMapping("deletee")
    public void del(@RequestParam String[] id);

    @RequestMapping("contractHX")
    public ContractBean huix(@RequestParam Integer id);

    @RequestMapping("updateContract")
    public void xiu(@RequestParam Integer id);
}
