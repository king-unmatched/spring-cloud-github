package com.jk.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class CostBean {
    private Integer id;

    private Integer costtype;

    private String money;

    private String costname;

    private Integer status;
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date costtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCosttype() {
        return costtype;
    }

    public void setCosttype(Integer costtype) {
        this.costtype = costtype;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money == null ? null : money.trim();
    }

    public String getCostname() {
        return costname;
    }

    public void setCostname(String costname) {
        this.costname = costname == null ? null : costname.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCosttime() {
        return costtime;
    }

    public void setCosttime(Date costtime) {
        this.costtime = costtime;
    }
}