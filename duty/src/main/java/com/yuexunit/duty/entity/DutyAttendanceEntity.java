package com.yuexunit.duty.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author pxl
 * @description
 * @date 2018/11/20 13:35
 */
@Entity
@Table(name = "ac_duty_attendance")
public class DutyAttendanceEntity {
    @Id
    @GeneratedValue
    @Column(name = "duty_attendance_id")
    private Long dutyAttendanceId;

    @Column(name = "attendance_date")
    private Date attendanceDate;

    @Column(name = "weekday")
    private Integer weekday;

    @Column(name = "type_id")
    private Long typeId;

    @Column(name = "type_name")
    private String typeName;

    @Column(name = "account_id")
    private Long accountId;

    @Column(name = "account_name")
    private String accountName;

    @Column(name = "depart_id")
    private Long departId;

    @Column(name = "depart_name")
    private String departName;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "overtime")
    private BigDecimal overtime;

    @Column(name = "absence_state")
    private Integer absenceState;

    @Column(name = "holiday_state")
    private Integer holidayState;


    public Long getDutyAttendanceId() {
        return dutyAttendanceId;
    }

    public void setDutyAttendanceId(Long dutyAttendanceId) {
        this.dutyAttendanceId = dutyAttendanceId;
    }

    public Date getAttendanceDate() {
        return attendanceDate;
    }

    public void setAttendanceDate(Date attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    public Integer getWeekday() {
        return weekday;
    }

    public void setWeekday(Integer weekday) {
        this.weekday = weekday;
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

    public Long getDepartId() {
        return departId;
    }

    public void setDepartId(Long departId) {
        this.departId = departId;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public BigDecimal getOvertime() {
        return overtime;
    }

    public void setOvertime(BigDecimal overtime) {
        this.overtime = overtime;
    }

    public Integer getAbsenceState() {
        return absenceState;
    }

    public void setAbsenceState(Integer absenceState) {
        this.absenceState = absenceState;
    }

    public Integer getHolidayState() {
        return holidayState;
    }

    public void setHolidayState(Integer holidayState) {
        this.holidayState = holidayState;
    }

    @Override
    public String toString() {
        return "DutyAttendanceEntity{" +
                "dutyAttendanceId=" + dutyAttendanceId +
                ", attendanceDate=" + attendanceDate +
                ", weekday=" + weekday +
                ", typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                ", accountId=" + accountId +
                ", accountName='" + accountName + '\'' +
                ", departId=" + departId +
                ", departName='" + departName + '\'' +
                ", createDate=" + createDate +
                ", overtime=" + overtime +
                '}';
    }
}
