package com.jk.service;

import com.jk.entity.StaffBean;
import com.jk.pojo.PageResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "contract-provider")
public interface StaffService {

    @RequestMapping("findStaff")
    public PageResult selectStaff(@RequestParam Integer currPage, @RequestParam Integer pageSize);

    @RequestMapping("addStaff")
    public void insertStaff(@RequestBody StaffBean staff);

    @RequestMapping("deleteStaff")
    public void delStaff(@RequestParam String[] staffId);

    @RequestMapping("StaffHX")
    public StaffBean StaffHX(@RequestParam Integer staffId);

    @RequestMapping("updateStaff")
    public void xiuStaff(@RequestParam Integer staffId,@RequestParam Integer staffStatus);
}
