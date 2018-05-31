package com.jason.shop.order.dao.model;

import java.util.Date;

public class TbItemCat {
    /** 类目ID */
    private Long id;

    /** 父分类ID=0时代表一级根分类 */
    private Long parentId;

    /** 分类名称 */
    private String name;

    /** 状态 1启用 0禁用 */
    private Integer status;

    /** 排列序号 */
    private Integer sortOrder;

    /** 是否为父分类 1为true 0为false */
    private Boolean isParent;

    /** 图标 */
    private String icon;

    /** 备注 */
    private String remark;

    /** 创建时间 */
    private Date created;

    /** 更新时间 */
    private Date updated;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Boolean getIsParent() {
        return isParent;
    }

    public void setIsParent(Boolean isParent) {
        this.isParent = isParent;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}