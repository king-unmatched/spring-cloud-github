package com.jk.service;

import com.jk.entity.CostBean;
import com.jk.pojo.PageResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "cost-provider")
public interface CostService {

    @RequestMapping("list")
    public PageResult selectlist(@RequestParam Integer currPage, @RequestParam Integer pageSize,@RequestBody CostBean cost);

    @RequestMapping("addCost")
    public void addCost(@RequestBody CostBean cos);

    @RequestMapping("huixian")
    public CostBean huixian(@RequestParam Integer id);

    @RequestMapping("zhuangtai")
    public void zhuangtai(@RequestParam Integer id,@RequestParam Integer status);

    @RequestMapping("delcost")
    public void delcost(@RequestParam String id);
}
