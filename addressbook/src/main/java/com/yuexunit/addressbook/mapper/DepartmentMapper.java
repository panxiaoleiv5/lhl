package com.yuexunit.addressbook.mapper;
import org.apache.ibatis.annotations.Param;

import com.yuexunit.addressbook.entity.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* Created by Mybatis Generator 2019/04/29
*/
@Mapper
public interface DepartmentMapper {
    int deleteByPrimaryKey(Integer departmentId);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer departmentId);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKeyWithBLOBs(Department record);

    int updateByPrimaryKey(Department record);

    List<Integer> inquireSubDepartId(@Param("departIds") List<Integer> departIds);

}