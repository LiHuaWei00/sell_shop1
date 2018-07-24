package com.imooc.sell_shop.service.impl;

import com.imooc.sell_shop.dto.OrderDTO;
import com.imooc.sell_shop.enums.ResultEnum;
import com.imooc.sell_shop.exception.SellRxception;
import com.imooc.sell_shop.service.BuyerService;
import com.imooc.sell_shop.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ Author     ：李华伟
 * @ Date       ：Created in 13:29 2018/7/24
 */
@Service
@Slf4j
public class BuyerServiceImpl implements BuyerService {
    @Autowired
    private OrderService orderService;


    @Override
    public OrderDTO findOrderOne(String openid, String orderId) {
        return checkOrderOwner(openid,orderId);
    }

    @Override
    public OrderDTO cancelOrder(String openid, String orderId) {
        OrderDTO orderDTO = checkOrderOwner(openid,orderId);
        if(orderDTO == null){
            log.error("[取消订单]查不到该订单，orderId={}",orderId);
            throw new SellRxception(ResultEnum.ORDER_NOT_EXIST);
        }
        return orderService.cancel(orderDTO);
    }
    private OrderDTO checkOrderOwner(String openid, String orderId){
        OrderDTO orderDTO = orderService.findOne(orderId);
        if(orderDTO == null){
            return null;
        }
        //判断是否是自己的订单
        if(!orderDTO.getBuyerOpenid().equals(openid)){
            log.error("[查询订单]订单的openid不一致.openid={},orderDTO={}",openid,orderDTO);
            throw new SellRxception(ResultEnum.ORDER_OWNER_ERROR);
        }
        return orderDTO;
    }
}
