package com.jk.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Merchant {
    private Integer merchantId;

    private String merchantName;

    private String merchantIncome;
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date merchantAssumedate;

    private Integer merchantStatus;

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    public String getMerchantIncome() {
        return merchantIncome;
    }

    public void setMerchantIncome(String merchantIncome) {
        this.merchantIncome = merchantIncome == null ? null : merchantIncome.trim();
    }

    public Date getMerchantAssumedate() {
        return merchantAssumedate;
    }

    public void setMerchantAssumedate(Date merchantAssumedate) {
        this.merchantAssumedate = merchantAssumedate;
    }

    public Integer getMerchantStatus() {
        return merchantStatus;
    }

    public void setMerchantStatus(Integer merchantStatus) {
        this.merchantStatus = merchantStatus;
    }
}