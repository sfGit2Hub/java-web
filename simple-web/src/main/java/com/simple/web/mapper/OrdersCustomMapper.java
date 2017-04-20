package com.simple.web.mapper;

import com.simple.web.entity.Orders;
import com.simple.web.entity.OrdersCustom;

import java.util.List;

/**
 * Created by SF on 2017/4/20.
 */
public interface OrdersCustomMapper {
    /** 查询订单，关联查询用户信息 */
    List<OrdersCustom> findOrdersUser();

    /** 查询订单关联查询用户信息，使用reslutMap实现*/
    List<Orders> findOrdersUserResultMap();
}
