package com.jk.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class ContractBean {
    private Integer id;

    private String contract;

    private String contractname;

    private Integer contracttype;

    private String name;
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date cometime;
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date voidancetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract == null ? null : contract.trim();
    }

    public String getContractname() {
        return contractname;
    }

    public void setContractname(String contractname) {
        this.contractname = contractname == null ? null : contractname.trim();
    }

    public Integer getContracttype() {
        return contracttype;
    }

    public void setContracttype(Integer contracttype) {
        this.contracttype = contracttype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getCometime() {
        return cometime;
    }

    public void setCometime(Date cometime) {
        this.cometime = cometime;
    }

    public Date getVoidancetime() {
        return voidancetime;
    }

    public void setVoidancetime(Date voidancetime) {
        this.voidancetime = voidancetime;
    }
}