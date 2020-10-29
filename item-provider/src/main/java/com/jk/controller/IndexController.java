package com.jk.controller;

import com.jk.entity.Tree;
import com.jk.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {

    @Autowired
    private IndexService ser;

    @RequestMapping("shu")
    public List<Tree> select(@RequestParam Integer id) {
        return ser.select(id);
    }
}
