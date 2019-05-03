package com.yuexunit.duty.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by admin on 2016/6/28.
 */
@Entity
@Table(name = "AC_DUTY")
@Cacheable(maxCount = 5000, timeToIdleSeconds = 36000)
public class DutyEntity {
    @Id
    @GeneratedValue
    @Column(name = "duty_ID")
    private Long ID;
    @Column(name = "Date")
    private Date date;
    @Column(name = "Week")
    private String week;
    @Column(name = "type_id")
    private Long typeId;
    @Column(name = "type_name")
    private String typeName;
    @Column(name = "State")
    private int state;
    @Column(name = "Lock_DT")
    private Date Lock_DT;
    @Column(name = "Remark")
    private String remark;
    @Column(name = "AccountId")
    private Long Account_id;
    @Column(name = "AccountName")
    private String AccountName;
    @Column(name = "depart_id")
    private Integer departId;

    @Column(name = "holiday_state")
    private Integer holidayState;

    public Long getID() {
        return this.ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public String getWeek() {
        return this.week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public int getState() {
        return this.state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Long getAccount_id() {
        return this.Account_id;
    }

    public void setAccount_id(Long account_id) {
        this.Account_id = account_id;
    }

    public String getAccountName() {
        return this.AccountName;
    }

    public void setAccountName(String accountName) {
        this.AccountName = accountName;
    }

    public Integer getDepartId() {
        return departId;
    }

    public void setDepartId(Integer departId) {
        this.departId = departId;
    }

    public Date getLock_DT() {
        return this.Lock_DT;
    }

    public void setLock_DT(Date lock_DT) {
        this.Lock_DT = lock_DT;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getHolidayState() {
        return holidayState;
    }

    public void setHolidayState(Integer holidayState) {
        this.holidayState = holidayState;
    }
}
