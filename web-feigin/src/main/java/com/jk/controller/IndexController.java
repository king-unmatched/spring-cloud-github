package com.jk.controller;

import com.jk.entity.Tree;
import com.jk.service.IndexService;
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
        return ser.select();
    }

    @RequestMapping("index")
    public String index(){
        return "index";
    }

    @RequestMapping("itemShow")
    public String itemShow(){
        return "Item/ItemShow";
    }
}
