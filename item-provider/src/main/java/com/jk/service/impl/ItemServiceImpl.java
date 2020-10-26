package com.jk.service.impl;

import com.jk.dao.ItemBeanMapper;
import com.jk.entity.ItemBean;
import com.jk.pojo.PageResult;
import com.jk.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemBeanMapper mapper;
    @Override
    public PageResult select(Integer currPage, Integer pageSize, ItemBean item) {
        Long total = mapper.count(item);
        List<ItemBean> itemBean = mapper.findPage(currPage, pageSize,item);
        Long totalPage = total%pageSize == 0 ? total/pageSize : (total/pageSize + 1);
        return new PageResult(total, itemBean, currPage, pageSize, totalPage);
    }

    @Override
    public void insert(ItemBean item) {
        if (item.getId()==null){
            item.setItemcreatime(new Date());
            mapper.insert(item);
        }else{
            mapper.updateByPrimaryKeySelective(item);
        }
    }

    @Override
    public void del(String[] id) {
        mapper.del(id);
    }

    @Override
    public ItemBean huix(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }
}
