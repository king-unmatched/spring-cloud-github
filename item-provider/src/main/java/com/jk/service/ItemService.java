package com.jk.service;

import com.jk.entity.ItemBean;
import com.jk.pojo.PageResult;

public interface ItemService {


    PageResult select(Integer currPage, Integer pageSize, ItemBean item);

    void insert(ItemBean item);

    void del(String[] id);

    ItemBean huix(Integer id);
}
