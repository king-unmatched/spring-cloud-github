package com.jk.service;

import com.jk.entity.CostBean;
import com.jk.pojo.PageResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "cost-provider")
public interface CostService {

    @RequestMapping("select")
    public PageResult selectlist(@RequestParam(value="currPage",defaultValue="1")Integer currPage, @RequestParam(value="pageSize",defaultValue="3")Integer pageSize,@RequestBody CostBean cost);

    @RequestMapping("addCost")
    public void addCost(@RequestBody CostBean cos);

    @RequestMapping("huixian")
    public CostBean huixian(@RequestParam Integer id);


}
