package com.yuexunit.duty.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author pxl
 * @description
 * @date 2019/2/19 15:59
 */
@Entity
@Table(name = "ac_duty_surplus")
public class DutySurplusEntity {
    @Id
    @GeneratedValue
    @Column(name = "duty_surplus_id")
    private Long dutySurplusId;

    @Column(name = "account_id")
    private Long accountId;

    @Column(name = "account_name")
    private String accountName;

    @Column(name = "surplus_day")
    private BigDecimal surplusDay;

    @Column(name = "month")
    private String month;

    @Column(name = "create_date")
    private Date createDate;

    public Long getDutySurplusId() {
        return dutySurplusId;
    }

    public void setDutySurplusId(Long dutySurplusId) {
        this.dutySurplusId = dutySurplusId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public BigDecimal getSurplusDay() {
        return surplusDay;
    }

    public void setSurplusDay(BigDecimal surplusDay) {
        this.surplusDay = surplusDay;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
