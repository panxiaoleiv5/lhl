package com.yuexunit.addressbook.controller;

import com.yuexunit.addressbook.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author pxl
 * @description
 * @date 2019/4/28 16:45
 */
@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/inquireSubDepartId")
    public List<Integer> inquireSubDepartId(Integer departmentId){
        return departmentService.inquireAllSubDepartmentId(departmentId);
    }
}
