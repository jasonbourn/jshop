package com.jason.shop.order.dao.model;

import java.math.BigDecimal;
import java.util.Date;

public class TbItem {
    /** 商品id，同时也是商品编号 */
    private Long id;

    /** 商品标题 */
    private String title;

    /** 商品卖点 */
    private String sellPoint;

    /** 商品价格 */
    private BigDecimal price;

    /** 库存数量 */
    private Integer num;

    /** 售卖数量限制 */
    private Integer limitNum;

    /** 商品图片 */
    private String image;

    /** 所属分类 */
    private Long cid;

    /** 商品状态 1正常 0下架 */
    private Integer status;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSellPoint() {
        return sellPoint;
    }

    public void setSellPoint(String sellPoint) {
        this.sellPoint = sellPoint == null ? null : sellPoint.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getLimitNum() {
        return limitNum;
    }

    public void setLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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