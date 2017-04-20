package com.simple.web.entity;

/**
 * Created by SF on 2017/4/20.
 */
public class OrderDetail {
    /** 主鍵，訂單明细表Id */
    private Integer id;
    /** 訂單Id */
    private Integer ordersId;
    /** 商品id */
    private Integer itemsId;
    /** 商品购买数量 */
    private Integer itemsNum;
    // 明细对应的商品信息
    private Items items;

    public Integer getId() {
        return id;
    }

    public OrderDetail setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getOrdersId() {
        return ordersId;
    }

    public OrderDetail setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
        return this;
    }

    public Integer getItemsId() {
        return itemsId;
    }

    public OrderDetail setItemsId(Integer itemsId) {
        this.itemsId = itemsId;
        return this;
    }

    public Integer getItemsNum() {
        return itemsNum;
    }

    public OrderDetail setItemsNum(Integer itemsNum) {
        this.itemsNum = itemsNum;
        return this;
    }

    public Items getItems() {
        return items;
    }

    public OrderDetail setItems(Items items) {
        this.items = items;
        return this;
    }
}
