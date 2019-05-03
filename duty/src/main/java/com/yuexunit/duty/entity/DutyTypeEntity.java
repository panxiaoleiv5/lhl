package com.yuexunit.duty.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by yuexun on 2017/8/22.
 */
@Entity
@Table(name = "ac_duty_type")
public class DutyTypeEntity {

    /**typeId**/
    @Id
    @GeneratedValue
    @Column(name = "type_id")
    private Long typeId;
    /**科室信息类型名**/
    @Column(name = "type_name")
    private String typeName;
    @Column(name = "start_time")
    private Date startTime;
    @Column(name = "end_time")
    private Date endTime;
    @Column(name = "rank_order")
    private Long rankOrder;
    /**status**/
    @Column(name = "status")
    private Integer status;
    /**createTime**/
    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "type_pinyin")
    private String typePinyin;

    @Column(name = "present_day")
    private BigDecimal presentDay;

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

    public Long getRankOrder() {
        return rankOrder;
    }

    public void setRankOrder(Long rankOrder) {
        this.rankOrder = rankOrder;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getTypePinyin() {
        return typePinyin;
    }

    public void setTypePinyin(String typePinyin) {
        this.typePinyin = typePinyin;
    }

    public BigDecimal getPresentDay() {
        return presentDay;
    }

    public void setPresentDay(BigDecimal presentDay) {
        this.presentDay = presentDay;
    }
}
