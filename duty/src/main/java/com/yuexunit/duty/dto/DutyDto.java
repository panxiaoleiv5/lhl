package com.yuexunit.duty.dto;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author pxl
 * @description
 * @date 2018/11/7 11:21
 */
public class DutyDto {
    private Long accountId;

    private Date dutyDate;

    private BigDecimal presentDay;

    private Integer presentNumber;

    private Long typeId;

    private String typeName;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Date getDutyDate() {
        return dutyDate;
    }

    public void setDutyDate(Date dutyDate) {
        this.dutyDate = dutyDate;
    }

    public BigDecimal getPresentDay() {
        return presentDay;
    }

    public void setPresentDay(BigDecimal presentDay) {
        this.presentDay = presentDay;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getPresentNumber() {
        return presentNumber;
    }

    public void setPresentNumber(Integer presentNumber) {
        this.presentNumber = presentNumber;
    }
}
