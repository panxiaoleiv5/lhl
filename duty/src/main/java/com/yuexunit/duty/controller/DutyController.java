package com.yuexunit.duty.controller;

import com.yuexunit.duty.dto.DutyTotalDto;
import com.yuexunit.duty.dto.IReportFormDto;
import com.yuexunit.duty.entity.DutyMonthCountEntity;
import com.yuexunit.duty.entity.DutyRemarkEntity;
import exception.BizException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utils.DateNewUtil;
import utils.DateUtil;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author pxl
 * @description
 * @date 2019/4/28 15:59
 */
@RestController
@RequestMapping("/duty")
public class DutyController {
    @RequestMapping("/exportDutyListLhl")
    public String exportDutyListLhl(String date, String jobType, Integer departmentId){
        return null;
    }

    private IReportFormDto createDutyReportFormDto(String date, String jobType, Integer departmentId) {
        String month = date.substring(0, 7);
        //获取当月天数
        int monthDay = DateNewUtil.getMaxDaysOfMonth(DateUtil.from(date));
        String startDate = month + "-01";
        String endDate = month + "-" + monthDay;

        DutyRemarkEntity dutyRemarkEntity = dutyRemarkService.loadDutyRemark(DateUtil.from(date), Long.valueOf(departmentId.toString()), 1);
        String remark = dutyRemarkEntity == null ? "" : dutyRemarkEntity.getRemark();

        //报表的明细信息
        List<DutyTotalDto> dutyTotalDtos = new ArrayList<>();

        //查询该部门及其子部门的人员信息
        List<UserInfoEntity> userInfoEntities = userInfoService.searchUserInfoListByArg(null, null, departmentId.intValue(), null, null, 1, new PageCriteria(1, 9999), null, jobType);
        for (UserInfoEntity userInfoEntity : userInfoEntities) {
            DutyTotalDto dutyTotalDto = new DutyTotalDto();
            dutyTotalDto.setAccountId(userInfoEntity.getAccountId());
            dutyTotalDto.setUserName(userInfoEntity.getUserName());
            dutyTotalDtos.add(dutyTotalDto);
        }

        if (dutyTotalDtos.size() == 0) {
            throw new BizException("无排班人员");
        }

        //查询本月统计信息
        List<DutyMonthCountEntity> dutyMonthCountThis = dutyNumberService.inquireDutyMonthCountByMonth(DateUtil.from(startDate));
        for (DutyTotalDto dutyTotalDto : dutyTotalDtos) {
            dutyTotalDto.setDutyMonthCountThis(0);
            for (DutyMonthCountEntity dutyMonthCountEntity : dutyMonthCountThis) {
                if (dutyTotalDto.getAccountId().equals(dutyMonthCountEntity.getAccountId())) {
                    Integer dutyMonthCount = dutyMonthCountEntity.getMonthCount() == null ? 0 : dutyMonthCountEntity.getMonthCount();
                    dutyTotalDto.setDutyMonthCountThis(dutyMonthCount);
                    break;
                }
            }
        }

        //查询上月统计数据
        List<DutyMonthCountEntity> dutyMonthCountLast = dutyNumberService.inquireDutyMonthCountByMonth(DateNewUtil.addMonths(DateUtil.from(startDate), -1));
        for (DutyTotalDto dutyTotalDto : dutyTotalDtos) {
            dutyTotalDto.setDutyMonthCountLast(0);
            for (DutyMonthCountEntity dutyMonthCountEntity : dutyMonthCountLast) {
                if (dutyTotalDto.getAccountId().equals(dutyMonthCountEntity.getAccountId())) {
                    Integer dutyMonthCount = dutyMonthCountEntity.getMonthCount() == null ? 0 : dutyMonthCountEntity.getMonthCount();
                    dutyTotalDto.setDutyMonthCountLast(dutyMonthCount);
                    break;
                }
            }
        }

        //查询人员在当月的具体排班信息
        List<DutyDto> dutyDtos = dutyService.inquireDutyAndPresentList(startDate, endDate);
        //设置出勤天数和具体排班信息
        for (DutyTotalDto dutyTotalDto : dutyTotalDtos) {
            List<DutyDto> dutyDtoOfUser = new ArrayList<>();
            BigDecimal presentDays = new BigDecimal(0);
            for (DutyDto dutyDto : dutyDtos) {
                int i = 0;
                if (dutyTotalDto.getAccountId().equals(dutyDto.getAccountId())) {
                    dutyDtoOfUser.add(dutyDto);
                    presentDays = presentDays.add(dutyDto.getPresentDay());
                    i += 1;
                    if (i >= 31) {
                        break;
                    }
                }
            }
            dutyTotalDto.setDutyDtoList(dutyDtoOfUser);
            dutyTotalDto.setPresentDay(presentDays);
        }

        //设置婚假、病假等假期的天数
        setLeave(startDate, endDate, dutyTotalDtos);

        DepartmentEntity entity = departmentService.inquireDepartmentDetail(departmentId);

        //报表传输对象
        DutyReportFormDto dutyReportFormDto = new DutyReportFormDto();
        dutyReportFormDto.setMonth(month);
        dutyReportFormDto.setMonthDay(monthDay);
        dutyReportFormDto.setDepartmentName(entity.getDepartmentName());
        dutyReportFormDto.setRemark(remark);
        dutyReportFormDto.setDutyTotalDtoList(dutyTotalDtos);
        return dutyReportFormDto;
    }
}
