package com.yuexunit.duty.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * @author pxl
 * @description
 * @date 2018/11/16 10:19
 */
@Entity
@Table(name = "ac_duty_holiday")
public class DutyHolidayEntity {
    @Id
    @GeneratedValue
    @Column(name = "duty_holiday_id")
    private Long dutyHolidayId;

    @Column(name = "type_name")
    private String typeName;

    @Column(name = "convert_present_day")
    private Integer convertPresentDay;

    @Column(name = "enjoy_sex")
    private Integer enjoySex;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "create_date")
    private Date createDate;

    public Long getDutyHolidayId() {
        return dutyHolidayId;
    }

    public void setDutyHolidayId(Long dutyHolidayId) {
        this.dutyHolidayId = dutyHolidayId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getConvertPresentDay() {
        return convertPresentDay;
    }

    public void setConvertPresentDay(Integer convertPresentDay) {
        this.convertPresentDay = convertPresentDay;
    }

    public Integer getEnjoySex() {
        return enjoySex;
    }

    public void setEnjoySex(Integer enjoySex) {
        this.enjoySex = enjoySex;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
