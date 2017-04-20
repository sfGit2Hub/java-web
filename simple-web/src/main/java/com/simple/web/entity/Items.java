package com.simple.web.entity;

import java.util.Date;

/**
 * Created by SF on 2017/4/20.
 */
public class Items {
    /** 商品表主键Id */
    private Integer id;
    /** 商品名称 */
    private String itemsName;
    /** 商品定价 */
    private float price;
    /** 商品描述 */
    private String detail;
    /** 商品图片 */
    private String picture;
    /** 生产日期 */
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public Items setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getItemsName() {
        return itemsName;
    }

    public Items setItemsName(String itemsName) {
        this.itemsName = itemsName;
        return this;
    }

    public float getPrice() {
        return price;
    }

    public Items setPrice(float price) {
        this.price = price;
        return this;
    }

    public String getDetail() {
        return detail;
    }

    public Items setDetail(String detail) {
        this.detail = detail;
        return this;
    }

    public String getPicture() {
        return picture;
    }

    public Items setPicture(String picture) {
        this.picture = picture;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Items setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }
}
