package com.jk.service;

import com.jk.entity.ItemBean;
import com.jk.pojo.PageResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "item-provider")
public interface ItemService {

    @RequestMapping("select")
    public PageResult select(@RequestParam Integer currPage, @RequestParam Integer pageSize, @RequestBody ItemBean item);

    @RequestMapping("insert")
    public void insert (@RequestBody ItemBean item);

    @RequestMapping("del")
    public void del(@RequestBody String[] id);

    @RequestMapping("id")
    public ItemBean huix(@RequestParam Integer id);
}
