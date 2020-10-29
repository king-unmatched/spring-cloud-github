package com.jk.service;

import com.jk.entity.Merchant;
import com.jk.pojo.PageResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@FeignClient(value = "personnel-provider")
public interface MerchantService {

    @RequestMapping("merlistAll")
    public PageResult listAll(@RequestParam Integer currPage, @RequestParam Integer pageSize, @RequestBody Merchant mer);

    @RequestMapping("addMer")
    public void addMer(@RequestBody Merchant mer);

    @RequestMapping("delMer")
    public void delMer(@RequestParam String id);

    @RequestMapping("huixianMer")
    public Merchant  huixian(@RequestParam Integer id);
}
