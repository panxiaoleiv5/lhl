package com.yuexunit.duty.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * @author pxl
 * @description
 * @date 2018/11/16 11:21
 */
@Entity
@Table(name = "ac_duty_holiday_type")
public class DutyHolidayTypeEntity {
    @Id
    @GeneratedValue
    @Column(name = "duty_holiday_type_id")
    private Long dutyHolidayTypeId;

    @Column(name = "rank_order")
    private Integer rankOrder;

    @Column(name = "type_name")
    private String typeName;

    @Column(name = "create_date")
    private Date createDate;

    public Long getDutyHolidayTypeId() {
        return dutyHolidayTypeId;
    }

    public void setDutyHolidayTypeId(Long dutyHolidayTypeId) {
        this.dutyHolidayTypeId = dutyHolidayTypeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getRankOrder() {
        return rankOrder;
    }

    public void setRankOrder(Integer rankOrder) {
        this.rankOrder = rankOrder;
    }
}
