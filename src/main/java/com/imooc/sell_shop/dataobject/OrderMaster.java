package com.imooc.sell_shop.dataobject;

import com.imooc.sell_shop.enums.OrderStatusEnum;
import com.imooc.sell_shop.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @ Author     ：李华伟
 * @ Date       ：Created in 10:12 2018/7/20
 */
@Entity
@DynamicUpdate
@Data
public class OrderMaster {
    @Id
    private String orderId;

    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;

    private String buyerOpenid;

    private BigDecimal orderAmout;

    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    private  Integer payStatus = PayStatusEnum.WAIT.getCode();

    private Date createTime;

    private Date updateTime;

}
