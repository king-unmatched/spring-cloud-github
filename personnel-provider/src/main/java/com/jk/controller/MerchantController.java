package com.jk.controller;

import com.jk.entity.Merchant;
import com.jk.entity.Personnel;
import com.jk.pojo.PageResult;
import com.jk.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MerchantController {
     @Autowired
    private MerchantService merchantService;

     @RequestMapping("merlistAll")
     public PageResult listAll(@RequestParam Integer currPage, @RequestParam Integer pageSize, @RequestBody Merchant mer){
         return merchantService.merlistAll(currPage,pageSize,mer);
     }
    @RequestMapping("addMer")
    public void addMer(@RequestBody Merchant mer){
        merchantService.addMer(mer);
    }

    @RequestMapping("delMer")
    public void delMer(@RequestParam String id){
        merchantService.delMer(id);
    }

    @RequestMapping("huixianMer")
    public Merchant  huixian(@RequestParam Integer id){
        return merchantService.huixian(id);
    }
}
