package com.imooc.sell_shop.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @ Author     ：李华伟
 * @ Date       ：Created in 15:38 2018/7/19
 */
@Entity
@Data
public class ProductInfo {
    @Id
    private String productId;
    private String productName;
    private BigDecimal productPrice;
    private Integer productStock;
    private String productDescription;
    private  String productIcon;
    private Integer productStatus;
    private Integer categoryType;

}
