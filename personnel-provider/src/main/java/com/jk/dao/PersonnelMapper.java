package com.jk.dao;

import com.jk.entity.Personnel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface PersonnelMapper {
    int deleteByPrimaryKey(Integer personnelId);

    int insert(Personnel record);

    int insertSelective(Personnel record);

    Personnel selectByPrimaryKey(Integer personnelId);

    int updateByPrimaryKeySelective(Personnel record);

    int updateByPrimaryKey(Personnel record);

    Long selectcount(@Param("per") Personnel per);

    List<Personnel> listAll(@Param("currPage") Integer currPage, @Param("pageSize") Integer pageSize, @Param("per") Personnel per);

    void delPer(@Param("id") String id);
}