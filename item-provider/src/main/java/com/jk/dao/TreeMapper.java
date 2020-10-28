package com.jk.dao;

import java.util.List;

import com.jk.entity.Tree;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TreeMapper {

	List<Tree> select(@Param("pid") Integer pid,@Param("id") Integer id);

}