package com.yuexunit.duty.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Chou on 2017/12/8.
 *
 */
@Entity
@Table(name = "ac_duty_remark")
public class DutyRemarkEntity {

    /**typeId**/
    @Id
    @GeneratedValue
    @Column(name = "remark_id")
    private Long remarkId;
    /**1值班安排 2总值班安排**/
    @Column(name = "type")
    private Integer type;
    @Column(name = "depart_id")
    private Long departId;//部门或行政部门id
//            `depart_id` INT(11) DEFAULT NULL COMMENT '部门或行政部门id',
@Column(name = "remark_date")
private Date remarkDate;//周
    @Column(name = "remark")
    private String remark;//备注
    @Column(name = "create_id")
    private Long createId;//人员id
//            `remark` VARCHAR(5120) DEFAULT NULL COMMENT '备注',
//            `create_id` BIGINT(20) DEFAULT NULL COMMENT '人员id',
@Column(name = "create_name")
private String createName;//人员姓名',
    @Column(name = "create_time")
    private Date createTime;//创建时间',

    public Long getRemarkId() {
        return remarkId;
    }

    public void setRemarkId(Long remarkId) {
        this.remarkId = remarkId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getDepartId() {
        return departId;
    }

    public void setDepartId(Long departId) {
        this.departId = departId;
    }

    public Date getRemarkDate() {
        return remarkDate;
    }

    public void setRemarkDate(Date remarkDate) {
        this.remarkDate = remarkDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getCreateId() {
        return createId;
    }

    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
