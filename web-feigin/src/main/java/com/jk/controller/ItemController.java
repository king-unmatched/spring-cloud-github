package com.jk.controller;

import com.jk.entity.ItemBean;
import com.jk.pojo.PageResult;
import com.jk.service.ItemService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("item")
public class ItemController {

    @Autowired
    private ItemService ser;

    @RequestMapping("select")
    public PageResult select(Integer currPage, Integer pageSize, ItemBean item){
        return ser.select(currPage,pageSize,item);
    }
    @RequestMapping("insert")
    @HystrixCommand(fallbackMethod = "insertFail",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="3000")
    })
    public String insert (ItemBean item){
        ser.insert(item);
        return "提交成功";
    }
    public String insertFail(ItemBean item){
        return "加载超时啦~!";
    }
    @RequestMapping("del")
    @HystrixCommand(fallbackMethod = "delFail",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="3000")
    })
    public String del(String[] id){
        ser.del(id);
        return "删除成功";
    }
    public String delFail(String[] id){
        return "加载超时啦~!";
    }
    @RequestMapping("huix")
    public ItemBean huix(Integer id){
        return ser.huix(id);
    }
}
