package com.jk.controller;

import com.jk.entity.Personnel;
import com.jk.pojo.PageResult;
import com.jk.service.PersonnelService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("go")
public class PersonnerController {
    @Autowired
    private PersonnelService  personnelService;

    @RequestMapping("list")
    @ResponseBody
    public PageResult listAll(Integer currPage, Integer pageSize, Personnel per){
        return personnelService.listAll(currPage,pageSize,per);
    }

    @RequestMapping("add")
    @ResponseBody
    @RequiresPermissions("per:add")
    public void add(Personnel per) {
        personnelService.addPer(per);
    }

    @RequestMapping("delPer")
    @ResponseBody
    @RequiresPermissions("per:delete")
    public void delPer(String id){
        personnelService.delPer(id);
    }

    @RequestMapping("huixian")
    @ResponseBody
    @RequiresPermissions("per:update")
    public Personnel  huixian( Integer id){
        return personnelService.huixian(id);
    }

    @RequestMapping("show")
    @RequiresPermissions("per:query")
    public String show(){
        return "personnel/index";
    }
}
