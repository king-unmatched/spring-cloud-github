package com.jk.dao;

import com.jk.entity.Merchant;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface MerchantMapper {
    int deleteByPrimaryKey(Integer merchantId);

    int insert(Merchant record);

    int insertSelective(Merchant record);

    Merchant selectByPrimaryKey(Integer merchantId);

    int updateByPrimaryKeySelective(Merchant record);

    int updateByPrimaryKey(Merchant record);

    Long selectcount(@Param("mer") Merchant mer);

    List<Merchant> merlistAll(@Param("currPage") Integer currPage, @Param("pageSize") Integer pageSize, @Param("mer") Merchant mer);

    void delMer(@Param("id") String id);
}