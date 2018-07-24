package com.imooc.sell_shop.converter;

import com.imooc.sell_shop.dataobject.OrderMaster;
import com.imooc.sell_shop.dto.OrderDTO;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @ Author     ：李华伟
 * @ Date       ：Created in 16:02 2018/7/20
 */
public class OrderMaster2OrderDTOConverter {
    public static OrderDTO convert(OrderMaster orderMaster){
        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster,orderDTO);
        return orderDTO;
    }
    public static List<OrderDTO> convert(List<OrderMaster> orderMasterList){
        return orderMasterList.stream().map(e->
        convert(e)
        ).collect(Collectors.toList());
    }
}
