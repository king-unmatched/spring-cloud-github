package com.jk.service.impl;

import com.jk.dao.PersonnelMapper;
import com.jk.entity.CostBean;
import com.jk.entity.Personnel;
import com.jk.pojo.PageResult;
import com.jk.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonnelServiceImpl  implements PersonnelService {
    @Autowired
    private PersonnelMapper  personnelMapper;
    @Override
    public PageResult listAll(Integer currPage, Integer pageSize, Personnel per) {
        Long total = personnelMapper.selectcount(per);
        List<Personnel> list = personnelMapper.listAll(currPage, pageSize,per);
        Long totalPage = total%pageSize == 0 ? total/pageSize : (total/pageSize + 1);
        return new PageResult(total, list, currPage, pageSize, totalPage);
    }

    @Override
    public void addPer(Personnel per) {
        if (per.getPersonnelId()==null){
            personnelMapper.insert(per);
        }else{
            personnelMapper.updateByPrimaryKeySelective(per);
        }
    }

    @Override
    public void delPer(String id) {
        personnelMapper.delPer(id);
    }

    @Override
    public Personnel huixian(Integer id) {
        return personnelMapper.selectByPrimaryKey(id);
    }
}
