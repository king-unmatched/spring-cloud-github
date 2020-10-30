package com.jk.service;

import com.jk.entity.Merchant;
import com.jk.pojo.PageResult;

public interface MerchantService {
    PageResult merlistAll(Integer currPage, Integer pageSize, Merchant mer);

    void addMer(Merchant mer);

    void delMer(String id);

    Merchant huixian(Integer id);
}
