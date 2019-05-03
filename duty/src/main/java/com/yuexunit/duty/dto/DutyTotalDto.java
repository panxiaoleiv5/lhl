package com.yuexunit.duty.dto;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author pxl
 * @description
 * @date 2018/12/13 16:05
 */
public class DutyTotalDto {
    /**
     * 账户id
     */
    private Long accountId;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 本月统计数据
     */
    private Integer dutyMonthCountThis;

    /**
     * 上月统计数据
     */
    private Integer dutyMonthCountLast;

    /**
     * 出勤天数
     */
    private BigDecimal presentDay;

    /**
     * 病假天数
     */
    private BigDecimal sickLeaveDays;

    /**
     * 哺乳假天数
     */
    private BigDecimal breastfeedingLeaveDays;

    /**
     * 产假天数
     */
    private BigDecimal maternityLeaveDays;

    /**
     * 事假天数
     */
    private BigDecimal affairLeaveDays;

    /**
     * 婚假天数
     */
    private BigDecimal marriageLeaveDays;

    /**
     * 丧假天数
     */
    private BigDecimal funeralLeaveDays;

    /**
     * 探亲假天数
     */
    private BigDecimal homeLeaveDays;

    /**
     * 夜班
     */
    private BigDecimal nightShiftDays;

    /**
     * 用户每天的排班信息
     */
    private List<DutyDto> dutyDtoList;

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

    public List<DutyDto> getDutyDtoList() {
        return dutyDtoList;
    }

    public void setDutyDtoList(List<DutyDto> dutyDtoList) {
        this.dutyDtoList = dutyDtoList;
    }

    public Integer getDutyMonthCountThis() {
        return dutyMonthCountThis;
    }

    public void setDutyMonthCountThis(Integer dutyMonthCountThis) {
        this.dutyMonthCountThis = dutyMonthCountThis;
    }

    public Integer getDutyMonthCountLast() {
        return dutyMonthCountLast;
    }

    public void setDutyMonthCountLast(Integer dutyMonthCountLast) {
        this.dutyMonthCountLast = dutyMonthCountLast;
    }

    public BigDecimal getPresentDay() {
        return presentDay;
    }

    public void setPresentDay(BigDecimal presentDay) {
        this.presentDay = presentDay;
    }

    public BigDecimal getSickLeaveDays() {
        return sickLeaveDays;
    }

    public void setSickLeaveDays(BigDecimal sickLeaveDays) {
        this.sickLeaveDays = sickLeaveDays;
    }

    public BigDecimal getBreastfeedingLeaveDays() {
        return breastfeedingLeaveDays;
    }

    public void setBreastfeedingLeaveDays(BigDecimal breastfeedingLeaveDays) {
        this.breastfeedingLeaveDays = breastfeedingLeaveDays;
    }

    public BigDecimal getMaternityLeaveDays() {
        return maternityLeaveDays;
    }

    public void setMaternityLeaveDays(BigDecimal maternityLeaveDays) {
        this.maternityLeaveDays = maternityLeaveDays;
    }

    public BigDecimal getAffairLeaveDays() {
        return affairLeaveDays;
    }

    public void setAffairLeaveDays(BigDecimal affairLeaveDays) {
        this.affairLeaveDays = affairLeaveDays;
    }

    public BigDecimal getMarriageLeaveDays() {
        return marriageLeaveDays;
    }

    public void setMarriageLeaveDays(BigDecimal marriageLeaveDays) {
        this.marriageLeaveDays = marriageLeaveDays;
    }

    public BigDecimal getFuneralLeaveDays() {
        return funeralLeaveDays;
    }

    public void setFuneralLeaveDays(BigDecimal funeralLeaveDays) {
        this.funeralLeaveDays = funeralLeaveDays;
    }

    public BigDecimal getHomeLeaveDays() {
        return homeLeaveDays;
    }

    public void setHomeLeaveDays(BigDecimal homeLeaveDays) {
        this.homeLeaveDays = homeLeaveDays;
    }

    public BigDecimal getNightShiftDays() {
        return nightShiftDays;
    }

    public void setNightShiftDays(BigDecimal nightShiftDays) {
        this.nightShiftDays = nightShiftDays;
    }
}
