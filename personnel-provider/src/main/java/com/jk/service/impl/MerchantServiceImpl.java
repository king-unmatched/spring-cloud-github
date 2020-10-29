package com.jk.service.impl;

import com.jk.dao.MerchantMapper;
import com.jk.entity.Merchant;
import com.jk.entity.Personnel;
import com.jk.pojo.PageResult;
import com.jk.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MerchantServiceImpl implements MerchantService {
     @Autowired
   private MerchantMapper  merchantMapper;
    @Override
    public PageResult merlistAll(Integer currPage, Integer pageSize, Merchant mer) {
        Long total = merchantMapper.selectcount(mer);
        List<Merchant> list = merchantMapper.merlistAll(currPage, pageSize,mer);
        Long totalPage = total%pageSize == 0 ? total/pageSize : (total/pageSize + 1);
        return new PageResult(total, list, currPage, pageSize, totalPage);
    }

    @Override
    public void addMer(Merchant mer) {
        if(mer.getMerchantId()==null){
            mer.setMerchantAssumedate(new Date());
            merchantMapper.insert(mer);
        }else{
            mer.setMerchantAssumedate(new Date());
            merchantMapper.updateByPrimaryKeySelective(mer);
        }
    }

    @Override
    public void delMer(String id) {
        merchantMapper.delMer(id);
    }

    @Override
    public Merchant huixian(Integer id) {
        return merchantMapper.selectByPrimaryKey(id);
    }
}
