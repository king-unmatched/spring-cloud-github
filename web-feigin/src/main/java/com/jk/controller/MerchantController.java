package com.jk.controller;

import com.jk.entity.Merchant;
import com.jk.pojo.PageResult;
import com.jk.service.MerchantService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("mer")
public class MerchantController {
    @Autowired
    private MerchantService  merchantService;

    @RequestMapping("list")
    @ResponseBody
    public PageResult listAll(Integer currPage,Integer pageSize, Merchant mer){
        return merchantService.listAll(currPage,pageSize,mer);
    }

    @RequestMapping("addMer")
    @ResponseBody
    @RequiresPermissions("mer:add")
    public void addMer(Merchant mer){
        merchantService.addMer(mer);
    }

    @RequestMapping("delMer")
    @ResponseBody
    @RequiresPermissions("mer:delete")
    public void delMer(@RequestParam String id){
        merchantService.delMer(id);
    }

    @RequestMapping("huixian")
    @ResponseBody
    @RequiresPermissions("mer:update")
    public Merchant huixian(@RequestParam Integer id){
       return merchantService.huixian(id);
    }

    @RequestMapping("show")
    @RequiresPermissions("mer:query")
    public String show(){
        return  "mer/show";
    }
}
