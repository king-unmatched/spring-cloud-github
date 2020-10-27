package com.jk.dao;

import com.jk.entity.CostBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface CostBeanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CostBean record);

    int insertSelective(CostBean record);

    CostBean selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CostBean record);

    int updateByPrimaryKey(CostBean record);

    Long selectcount(@Param("cost")CostBean cost);

    List<CostBean> selectlist(@Param("currPage") Integer currPage, @Param("pageSize")Integer pageSize, @Param("cost")CostBean cost);

    void zhuangtai(@Param("id") Integer id, @Param("status") Integer status);
}