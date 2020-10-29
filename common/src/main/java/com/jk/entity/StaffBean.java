package com.jk.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class StaffBean {
    private Integer staffId;

    private String staffName;

    private String staffMoney;

    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date staffEntrydate;

    private Integer staffStatus;

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public String getStaffMoney() {
        return staffMoney;
    }

    public void setStaffMoney(String staffMoney) {
        this.staffMoney = staffMoney == null ? null : staffMoney.trim();
    }

    public Date getStaffEntrydate() {
        return staffEntrydate;
    }

    public void setStaffEntrydate(Date staffEntrydate) {
        this.staffEntrydate = staffEntrydate;
    }

    public Integer getStaffStatus() {
        return staffStatus;
    }

    public void setStaffStatus(Integer staffStatus) {
        this.staffStatus = staffStatus;
    }
}