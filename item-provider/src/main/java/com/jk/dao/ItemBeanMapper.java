package com.jk.dao;

import com.jk.entity.ItemBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ItemBeanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ItemBean record);

    int insertSelective(ItemBean record);

    ItemBean selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ItemBean record);

    int updateByPrimaryKey(ItemBean record);

    Long count(@Param("item") ItemBean item);

    List<ItemBean> findPage(@Param("currPage")Integer currPage,@Param("pageSize") Integer pageSize,@Param("item") ItemBean item);

    void del(String[] id);
}