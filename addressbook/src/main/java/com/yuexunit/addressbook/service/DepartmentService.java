package com.yuexunit.addressbook.service;

import java.util.List;

/**
 * @author pxl
 * @description
 * @date 2019/4/28 19:23
 */
public interface DepartmentService {
    List<Integer> inquireAllSubDepartmentId(Integer departmentId);
}
