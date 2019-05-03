package com.yuexunit.duty.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * @author pxl
 * @description
 * @date 2019/1/24 14:43
 */
@Entity
@Table(name = "ac_duty_attendance_remind")
public class DutyAttendanceRemindEntity {
    @Id
    @GeneratedValue
    @Column(name = "attendance_remind_id")
    private Long attendanceRemindId;

    @Column(name = "account_id")
    private Long accountId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "create_date")
    private Date createDate;

    public Long getAttendanceRemindId() {
        return attendanceRemindId;
    }

    public void setAttendanceRemindId(Long attendanceRemindId) {
        this.attendanceRemindId = attendanceRemindId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
