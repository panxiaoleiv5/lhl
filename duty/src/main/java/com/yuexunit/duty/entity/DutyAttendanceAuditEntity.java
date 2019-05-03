package com.yuexunit.duty.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * @author pxl
 * @description
 * @date 2018/11/22 17:44
 */
@Entity
@Table(name = "ac_duty_attendance_audit")
public class DutyAttendanceAuditEntity {
    @Id
    @GeneratedValue
    @Column(name = "duty_attendance_audit_id")
    private Long dutyAttendanceAuditId;

    @Column(name = "attendance_month")
    private String attendanceMonth;

    @Column(name = "depart_id")
    private Long departId;

    @Column(name = "audit_state")
    private Integer auditState;

    @Column(name = "create_date")
    private Date createDate;

    public Long getDutyAttendanceAuditId() {
        return dutyAttendanceAuditId;
    }

    public void setDutyAttendanceAuditId(Long dutyAttendanceAuditId) {
        this.dutyAttendanceAuditId = dutyAttendanceAuditId;
    }

    public String getAttendanceMonth() {
        return attendanceMonth;
    }

    public void setAttendanceMonth(String attendanceMonth) {
        this.attendanceMonth = attendanceMonth;
    }

    public Long getDepartId() {
        return departId;
    }

    public void setDepartId(Long departId) {
        this.departId = departId;
    }

    public Integer getAuditState() {
        return auditState;
    }

    public void setAuditState(Integer auditState) {
        this.auditState = auditState;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
