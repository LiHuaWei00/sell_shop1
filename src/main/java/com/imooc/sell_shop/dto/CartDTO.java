package com.imooc.sell_shop.dto;

import lombok.Getter;

/**
 * 购物车
 * @ Author     ：李华伟
 * @ Date       ：Created in 13:34 2018/7/20
 */
@Getter
public class CartDTO {
    //商品ID
    private String productId;
    //数量
    private Integer productQuantity;

    public CartDTO(String productId,Integer productQuantity){
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
