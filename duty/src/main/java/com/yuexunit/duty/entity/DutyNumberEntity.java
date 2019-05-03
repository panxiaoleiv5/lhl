package com.yuexunit.duty.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by yuexun on 2017/8/23.
 */
@Entity
@Table(name = "ac_duty_number")
public class DutyNumberEntity {
    /**numberId**/
    @Id
    @GeneratedValue
    @Column(name = "number_id")
    private Long numberId;
    /**人员id**/
    @Column(name = "account_id")

    private Long accountId;
    /**人员名称**/
    @Column(name = "acount_name")
    private String accountName;
    /**月份**/
    @Column(name = "month")
    private Date month;
    /**剩余排班次数**/
    @Column(name = "count")
    private Integer count;

    /**类型id**/
    @Column(name = "type_id")
    private Long typeId;
    /**类型名称**/
    @Column(name = "type_name")
    private String typeName;
    /**status**/
    @Column(name = "status")
    private Boolean status;
    /**createTime**/
    @Column(name = "create_time")
    private Date createTime;

    public Long getNumberId() {
        return numberId;
    }

    public void setNumberId(Long numberId) {
        this.numberId = numberId;
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

    public Date getMonth() {
        return month;
    }

    public void setMonth(Date month) {
        this.month = month;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
