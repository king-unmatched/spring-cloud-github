package com.jk.dao;

import com.jk.entity.ContractBean;
import com.jk.entity.FoodBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Mapper
public interface FoodBeanMapper {
    int deleteByPrimaryKey(Integer foodId);

    int insert(FoodBean record);

    int insertSelective(FoodBean record);

    FoodBean selectByPrimaryKey(Integer foodId);

    int updateByPrimaryKeySelective(FoodBean record);

    int updateByPrimaryKey(FoodBean record);

    Long countFood();

    List<ContractBean> findFoodPage(@RequestParam Integer currPage, @RequestParam  Integer pageSize);
}