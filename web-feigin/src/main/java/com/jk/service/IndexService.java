package com.jk.service;

import com.jk.entity.Tree;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "item-provider")
public interface IndexService {

    @RequestMapping("shu")
    public List<Tree> select();
}
