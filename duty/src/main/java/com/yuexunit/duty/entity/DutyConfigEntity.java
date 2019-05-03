package com.yuexunit.duty.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by yuexun on 2017/8/22.
 */
@Entity
@Table(name = "ac_duty_config")
public class DutyConfigEntity {
    /**configId**/
    @Id
    @GeneratedValue
    @Column(name = "config_id")
    private Long configId;
    /**departId**/
    @Column(name = "depart_id")
    private Long departId;
    /**departName**/
    @Column(name = "depart_name")
    private String departName;
    /**typeId**/
    @Column(name = "type_id")
    private Long typeId;
    @Transient
    private String typeIds;
    /**typeName**/
    @Column(name = "type_name")
    private String typeName;
    @Column(name = "depart_order")
    private Integer departOrder;
    @Column(name = "type_order")
    private Integer typeOrder;
    @Transient
    private String typeOrders;
    /**status**/
    @Column(name = "status")
    private Integer status;
    /**createTime**/
    @Column(name = "create_time")
    private Date createTime;
    /**updateTime**/
    @Column(name = "update_time")
    private Date updateTime;

    public Long getConfigId() {
        return configId;
    }

    public void setConfigId(Long configId) {
        this.configId = configId;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDepartOrder() {
        return departOrder;
    }

    public void setDepartOrder(Integer departOrder) {
        this.departOrder = departOrder;
    }

    public Integer getTypeOrder() {
        return typeOrder;
    }

    public void setTypeOrder(Integer typeOrder) {
        this.typeOrder = typeOrder;
    }

    public String getTypeIds() {
        return typeIds;
    }

    public void setTypeIds(String typeIds) {
        this.typeIds = typeIds;
    }

    public String getTypeOrders() {
        return typeOrders;
    }

    public void setTypeOrders(String typeOrders) {
        this.typeOrders = typeOrders;
    }
}
