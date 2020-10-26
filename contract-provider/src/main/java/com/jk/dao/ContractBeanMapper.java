package com.jk.dao;

import com.jk.entity.ContractBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Mapper
public interface ContractBeanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(@RequestBody ContractBean contract);

    int insertSelective(ContractBean record);

    ContractBean selectByPrimaryKey(@RequestParam Integer id);

    int updateByPrimaryKeySelective(@RequestBody ContractBean contract);

    int updateByPrimaryKey(ContractBean record);

    Long count(@RequestParam String  name);

    List<ContractBean> findPage(@RequestParam Integer currPage, @RequestParam Integer pageSize, @RequestParam String  name);

    void del(@RequestParam String[] id);

    void xiu(@RequestParam Integer id);
}