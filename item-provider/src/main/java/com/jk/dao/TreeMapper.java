package com.jk.dao;

import java.util.List;

import com.jk.entity.Tree;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TreeMapper {

	List<Tree> select(int pid);

}