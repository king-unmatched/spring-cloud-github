package com.jk.service.Impl;

import com.jk.dao.CostBeanMapper;
import com.jk.entity.CostBean;
import com.jk.pojo.PageResult;
import com.jk.service.CostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Service
public class CostServiceImpl implements CostService {
    @Autowired
    private CostBeanMapper  costBeanMapper;


    @Override
    public PageResult select(Integer currPage, Integer pageSize, CostBean cost) {
        Long total = costBeanMapper.selectcount();
        List<CostBean> list = costBeanMapper.selectlist(currPage, pageSize,cost);
        Long totalPage = total%pageSize == 0 ? total/pageSize : (total/pageSize + 1);
        return new PageResult(total, list, currPage, pageSize, totalPage);
    }

    @Override
    public void addCost(@RequestBody CostBean cos) {
        if(cos.getId()==null){
            cos.setCosttime(new Date());
            costBeanMapper.insert(cos);
        }else{
            cos.setCosttime(new Date());
            costBeanMapper.updateByPrimaryKey(cos);
        }
    }

    @Override
    public CostBean huixian(@RequestParam  Integer id) {
        return costBeanMapper.selectByPrimaryKey(id);
    }

}
