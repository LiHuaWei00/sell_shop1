package com.imooc.sell_shop.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.imooc.sell_shop.dataobject.OrderDetail;
import com.imooc.sell_shop.enums.OrderStatusEnum;
import com.imooc.sell_shop.enums.PayStatusEnum;
import com.imooc.sell_shop.util.serializer.Date2LongSerializer;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @ Author     ：李华伟
 * @ Date       ：Created in 11:09 2018/7/20
 */
@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {
    private String orderId;

    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;

    private String buyerOpenid;

    private BigDecimal orderAmout;

    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    private  Integer payStatus = PayStatusEnum.WAIT.getCode();

    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;

    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    List<OrderDetail> orderDetailList;
}
