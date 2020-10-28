package com.jk.controller;

import com.jk.entity.CostBean;
import com.jk.entity.Personnel;
import com.jk.pojo.PageResult;
import com.jk.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonnelController {
    @Autowired
    private PersonnelService personnelService;

    @RequestMapping("listAll")
    public PageResult listAll(@RequestParam Integer currPage, @RequestParam Integer pageSize, @RequestBody Personnel per){
        return personnelService.listAll(currPage,pageSize,per);
    }

    @RequestMapping("addPer")
    public void addPer(@RequestBody Personnel per){
        personnelService.addPer(per);
    }

    @RequestMapping("delPer")
    public void delPer(@RequestParam String id){
        personnelService.delPer(id);
    }

    @RequestMapping("huixian")
    public Personnel  huixian(@RequestParam Integer id){
        return personnelService.huixian(id);
    }
}
