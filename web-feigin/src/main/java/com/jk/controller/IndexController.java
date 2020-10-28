package com.jk.controller;

import com.jk.entity.Tree;
import com.jk.entity.User;
import com.jk.service.IndexService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("index")
public class IndexController {

    @Autowired
    private IndexService ser;

    @RequestMapping("shu")
    @ResponseBody
    public List<Tree> select(){
        //查询当前用户所属的权限树
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        return ser.select(user.getId());
    }

    @RequestMapping("index")
    public String index(){
        return "index";
    }

    @RequestMapping("itemShow")
    @RequiresPermissions("item:query")
    public String itemShow(){
        return "Item/ItemShow";
    }


    @RequestMapping("login")
    public String login(){
        return "login";
    }
}
