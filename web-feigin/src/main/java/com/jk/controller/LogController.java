package com.jk.controller;

import com.jk.entity.LogBean;
import com.jk.pojo.PageResult;
import com.jk.service.LogService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
@RequestMapping("log")
public class LogController {

    @Autowired
    private LogService logService;
    @RequestMapping("mongodb")
    @ResponseBody
    public PageResult selectlist(Integer currPage,Integer pageSize, LogBean log){
        return logService.selectlist(currPage,pageSize,log);
    }
    @RequestMapping("show")
    @RequiresPermissions("log:show")
    public String show(){
        return "log/log";
    }

    @RequestMapping("delete")
    @ResponseBody
    public void delete(String[] id){
        logService.delete(id);
    }
}
