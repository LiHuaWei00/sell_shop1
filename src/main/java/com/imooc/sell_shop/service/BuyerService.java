package com.imooc.sell_shop.service;

import com.imooc.sell_shop.dto.OrderDTO;

/**
 * 买家接口
 * @ Author     ：李华伟
 * @ Date       ：Created in 13:26 2018/7/24
 */
public interface BuyerService {
    //查询一个订单
    OrderDTO findOrderOne(String openid,String orderId);
    //取消订单
    OrderDTO cancelOrder(String openid,String orderId);

}
