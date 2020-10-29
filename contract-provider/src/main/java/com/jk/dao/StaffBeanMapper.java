package com.jk.dao;

import com.jk.entity.ContractBean;
import com.jk.entity.StaffBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Mapper
public interface StaffBeanMapper {
    int deleteByPrimaryKey(Integer staffId);

    int insert(@RequestBody StaffBean staff);

    int insertSelective(StaffBean record);

    StaffBean selectByPrimaryKey(@RequestParam Integer staffId);

    int updateByPrimaryKeySelective(@RequestBody StaffBean record);

    int updateByPrimaryKey(StaffBean record);

    Long countStaff();

    List<ContractBean> findStaffPage(@RequestParam Integer currPage,@RequestParam  Integer pageSize);

    void del(@RequestParam String[] staffId);

    void xiuStaff(@RequestParam Integer staffId , @RequestParam Integer staffStatus);
}