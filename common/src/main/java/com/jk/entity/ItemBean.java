package com.jk.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class ItemBean {
    private Integer id;

    private String itemnumber;

    private String itemname;

    private String itemprincipal;

    private String itemstage;

    private Integer itemstatus;

    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date itemcreatime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItemnumber() {
        return itemnumber;
    }

    public void setItemnumber(String itemnumber) {
        this.itemnumber = itemnumber == null ? null : itemnumber.trim();
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname == null ? null : itemname.trim();
    }

    public String getItemprincipal() {
        return itemprincipal;
    }

    public void setItemprincipal(String itemprincipal) {
        this.itemprincipal = itemprincipal == null ? null : itemprincipal.trim();
    }

    public String getItemstage() {
        return itemstage;
    }

    public void setItemstage(String itemstage) {
        this.itemstage = itemstage == null ? null : itemstage.trim();
    }

    public Integer getItemstatus() {
        return itemstatus;
    }

    public void setItemstatus(Integer itemstatus) {
        this.itemstatus = itemstatus;
    }

    public Date getItemcreatime() {
        return itemcreatime;
    }

    public void setItemcreatime(Date itemcreatime) {
        this.itemcreatime = itemcreatime;
    }
}