package com.jk.service;

import com.jk.entity.Personnel;
import com.jk.pojo.PageResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "personnel-provider")
public interface PersonnelService {
    @RequestMapping("listAll")
    public PageResult listAll(@RequestParam Integer currPage, @RequestParam Integer pageSize, @RequestBody Personnel per);

    @RequestMapping("addPer")
    public void addPer(@RequestBody Personnel per);

    @RequestMapping("delPer")
    public void delPer(@RequestParam String id);

    @RequestMapping("huixian")
    public Personnel  huixian(@RequestParam Integer id);
}
