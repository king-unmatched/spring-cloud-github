package com.jk.service;

import com.jk.entity.ContractBean;
import com.jk.entity.StaffBean;
import com.jk.pojo.PageResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface ContractService {
    PageResult select(@RequestParam Integer currPage, @RequestParam Integer pageSize, @RequestParam String  name);

    void insert(@RequestBody ContractBean contract);

    void del(@RequestParam String[] id);

    ContractBean huix(@RequestParam Integer id);

    void xiu(@RequestParam Integer id);

    PageResult selectStaff(@RequestParam Integer currPage, @RequestParam Integer pageSize);

    void insertStaff(@RequestBody StaffBean staff);

    void delStaff(@RequestParam String[] staffId);

    StaffBean StaffHX(@RequestParam Integer staffId);

    void xiuStaff(@RequestParam Integer staffId, @RequestParam Integer staffStatus);
}
