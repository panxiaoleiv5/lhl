package com.yuexunit.duty.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "ac_duty_month_count")
public class DutyMonthCountEntity {
    @Id
    @GeneratedValue
    @Column(name = "month_count_id")
    private Long monthCountId;

    @Column(name = "account_id")
    private Long accountId;

    @Column(name = "acount_name")
    private String acountName;

    @Column(name = "month")
    private Date month;

    @Column(name = "month_count")
    private Integer monthCount;

    @Column(name = "remark")
    private String remark;

    @Column(name = "present")
    private Integer present;

    @Column(name = "rest")
    private Integer rest;

    @Column(name = "surplus")
    private BigDecimal surplus;

    @Column(name = "create_time")
    private Date createTime;

    public Long getMonthCountId() {
        return monthCountId;
    }

    public void setMonthCountId(Long monthCountId) {
        this.monthCountId = monthCountId;
    }

    public Integer getMonthCount() {
        return monthCount;
    }

    public void setMonthCount(Integer monthCount) {
        this.monthCount = monthCount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getAcountName() {
        return acountName;
    }

    public void setAcountName(String acountName) {
        this.acountName = acountName;
    }

    public Date getMonth() {
        return month;
    }

    public void setMonth(Date month) {
        this.month = month;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getPresent() {
        return present;
    }

    public void setPresent(Integer present) {
        this.present = present;
    }

    public Integer getRest() {
        return rest;
    }

    public void setRest(Integer rest) {
        this.rest = rest;
    }

    public BigDecimal getSurplus() {
        return surplus;
    }

    public void setSurplus(BigDecimal surplus) {
        this.surplus = surplus;
    }
}
