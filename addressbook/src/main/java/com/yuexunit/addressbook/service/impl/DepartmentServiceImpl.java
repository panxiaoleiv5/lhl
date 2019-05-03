package com.yuexunit.addressbook.service.impl;

import com.yuexunit.addressbook.mapper.DepartmentMapper;
import com.yuexunit.addressbook.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pxl
 * @description
 * @date 2019/4/28 19:23
 */
@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Integer> inquireAllSubDepartmentId(Integer departmentId) {
        List<Integer> parentDepartmentId = new ArrayList<>();
        parentDepartmentId.add(departmentId);
        List<Integer> departmentIds = departmentMapper.inquireSubDepartId(parentDepartmentId);

        //查询子部门的子部门
        List<Integer> subDepartIds = null;
        if (departmentIds.size() > 0){
            subDepartIds = departmentMapper.inquireSubDepartId(departmentIds);
        }

        //查询子部门的子部门的子部门
        List<Integer> subOfSubDepartIds = null;
        if (subDepartIds != null&&subDepartIds.size() > 0){
            subOfSubDepartIds = departmentMapper.inquireSubDepartId(subDepartIds);
        }
        List<Integer> departIdAll = new ArrayList<>();
        departIdAll.add(departmentId);
        departIdAll.addAll(departmentIds);
        if (subDepartIds != null){
            departIdAll.addAll(subDepartIds);
        }
        if (subOfSubDepartIds != null){
            departIdAll.addAll(subOfSubDepartIds);
        }
        return departIdAll;
    }

}
