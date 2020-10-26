package com.jk.dao;

import com.jk.entity.ItemBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemBeanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ItemBean record);

    int insertSelective(ItemBean record);

    ItemBean selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ItemBean record);

    int updateByPrimaryKey(ItemBean record);

    Long count();

    List<ItemBean> findPage(Integer currPage, Integer pageSize);

    void del(String[] id);
}