package com.yuexunit.addressbook.entity;

import java.io.Serializable;
import lombok.Data;

/**
* Created by Mybatis Generator 2019/04/29
*/
@Data
public class Department implements Serializable {
    /**
	* 部门ID
	*/
    private Integer departmentId;

    /**
	* 部门名称
	*/
    private String departmentName;

    /**
	* 全称
	*/
    private String fullName;

    /**
	* 上级部门ID
准备废弃 2016-06-29
	*/
    private Integer parentDepartmentId;

    /**
	* his中的部门编号
	*/
    private String hisDepartNo;

    /**
	* 图片ID
	*/
    private Integer imageId;

    /**
	* 负责人ID
	*/
    private Integer managerPersonId;

    /**
	* 发送短信权限
	*/
    private Integer sendMessageGrade;

    /**
	* 排序字段
	*/
    private Integer departmentOrder;

    /**
	* 部门层级 顶级为1，依次+
	*/
    private Byte departmentLevel;

    /**
	* 是否可用非0删除
	*/
    private Integer deleteflag;

    /**
	* 创建时间
	*/
    private Long createTime;

    /**
	* 修改时间
	*/
    private Long lastUpdateTime;

    /**
	* 直接子部门数
	*/
    private Integer zbms;

    /**
	* 直接部门人数
	*/
    private Integer bmrs;

    /**
	* 
	*/
    private Integer zbmzs;

    /**
	* 
	*/
    private Integer bmzrs;

    /**
	* 地址
	*/
    private String address;

    /**
	* 负责人
	*/
    private String principal;

    /**
	* 联系电话
	*/
    private String tel;

    /**
	* 传真
	*/
    private String fax;

    /**
	* 值班时间
	*/
    private String dutytime;

    /**
	* 拼音首字母
	*/
    private String firstPinyin;

    /**
	* 拼音全字母
	*/
    private String fullPinyin;

    /**
	* 
	*/
    private String email;

    /**
	* 床位数量
	*/
    private Integer bedAmount;

    /**
	* 医疗特色
	*/
    private String medicalChara;

    /**
	* 仪器设备
	*/
    private String instrument;

    /**
	* 诊疗范围
	*/
    private String treatScope;

    /**
	* 类型id
	*/
    private Long accountTitleId;

    /**
	* 部门类型名称
	*/
    private String accountTitleName;

    /**
	* 简介
	*/
    private String introduction;

    private static final long serialVersionUID = 1L;
}