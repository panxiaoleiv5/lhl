package com.yuexunit.duty.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * @author pxl
 * @description
 * @date 2018/12/24 10:06
 */
@Entity
@Table(name = "ac_duty_rest")
public class DutyRestEntity {
    @Id
    @GeneratedValue
    @Column(name = "duty_rest_id")
    private Long dutyRestId;

    @Column(name = "month")
    private String month;

    @Column(name = "rest_day")
    private Integer restDay;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "update_date")
    private Date updateDate;

    public Long getDutyRestId() {
        return dutyRestId;
    }

    public void setDutyRestId(Long dutyRestId) {
        this.dutyRestId = dutyRestId;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Integer getRestDay() {
        return restDay;
    }

    public void setRestDay(Integer restDay) {
        this.restDay = restDay;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
