package com.jk.service.impl;

import com.jk.dao.ContractBeanMapper;
import com.jk.dao.StaffBeanMapper;
import com.jk.entity.ContractBean;
import com.jk.entity.StaffBean;
import com.jk.pojo.PageResult;
import com.jk.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class ContractServiceImpl implements ContractService {

    @Autowired
    private ContractBeanMapper contractBeanMapper;
    @Autowired
    private StaffBeanMapper staffBeanMapper;



    @Override
    public PageResult select(Integer currPage, Integer pageSize, @RequestBody String  name) {
        Long total = contractBeanMapper.count(name);
        List<ContractBean> naviglist = contractBeanMapper.findPage(currPage, pageSize, name);
        Long totalPage = total%pageSize == 0 ? total/pageSize : (total/pageSize + 1);
        return new PageResult(total, naviglist, currPage, pageSize, totalPage);
    }

    @Override
    public void insert(ContractBean contract) {
        if (contract.getId() == null){
            contractBeanMapper.insert(contract);
        }else{
            contractBeanMapper.updateByPrimaryKeySelective(contract);
        }
    }

    @Override
    public void del(String[] id) {
        contractBeanMapper.del(id);
    }

    @Override
    public ContractBean huix(Integer id) {
        return contractBeanMapper.selectByPrimaryKey(id);
    }

    @Override
    public void xiu(Integer id) {
        contractBeanMapper.xiu(id);
    }


    @Override
    public PageResult selectStaff(Integer currPage, Integer pageSize) {
        Long total = staffBeanMapper.countStaff();
        List<ContractBean> naviglist = staffBeanMapper.findStaffPage(currPage, pageSize);
        Long totalPage = total%pageSize == 0 ? total/pageSize : (total/pageSize + 1);
        return new PageResult(total, naviglist, currPage, pageSize, totalPage);
    }

    @Override
    public void insertStaff(StaffBean staff) {
        if (staff.getStaffId() == null){
            staffBeanMapper.insert(staff);
        }else{
            staffBeanMapper.updateByPrimaryKeySelective(staff);
        }
    }

    @Override
    public void delStaff(String[] staffId) {
        staffBeanMapper.del(staffId);
    }

    @Override
    public StaffBean StaffHX(Integer staffId) {
        return staffBeanMapper.selectByPrimaryKey(staffId);
    }


    @Override
    public void xiuStaff(@RequestParam Integer staffId,@RequestParam Integer staffStatus) {
        staffBeanMapper.xiuStaff(staffId,staffStatus);
    }
}
