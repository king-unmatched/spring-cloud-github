package com.jk.controller;

import com.jk.entity.ContractBean;
import com.jk.entity.StaffBean;
import com.jk.pojo.PageResult;
import com.jk.service.ContractService;
import com.jk.service.StaffService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("staff")
public class StaffController {

    @Autowired
    private StaffService staffService;


    @RequestMapping("show")
    @RequiresPermissions("staff:query")
    public String show(){
        return "staff/show";
    }


    @RequestMapping("findStaff")
    @ResponseBody
    public PageResult selectStaff(Integer currPage, Integer pageSize){
        PageResult selectStaff = staffService.selectStaff(currPage, pageSize);
        return selectStaff;
    }


    @RequestMapping("addStaff")
    @ResponseBody
    @RequiresPermissions("staff:add")
    public void insertStaff(StaffBean staff){
        staffService.insertStaff(staff);
    }


    @RequestMapping("deleteStaff")
    @ResponseBody
    @RequiresPermissions("staff:delete")
    public void delStaff(String[] staffId){
        staffService.delStaff(staffId);
    }


    @RequestMapping("StaffHX")
    @ResponseBody
    @RequiresPermissions("staff:update")
    public StaffBean StaffHX(Integer staffId){
        return staffService.StaffHX(staffId);
    }


    @RequestMapping("updateStaff")
    @ResponseBody
    public void xiuStaff(Integer staffId,Integer staffStatus){
        staffService.xiuStaff(staffId,staffStatus);
    }
}
