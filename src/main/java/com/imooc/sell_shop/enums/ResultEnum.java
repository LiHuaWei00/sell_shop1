package com.imooc.sell_shop.enums;

import lombok.Getter;

/**
 * @ Author     ：李华伟
 * @ Date       ：Created in 11:29 2018/7/20
 */
@Getter
public enum  ResultEnum {

    PRODUCT_NOT_EXIT(10,"商品不存在"),
    PRODUCT_STOCK_ERROR(11,"商品库存不正确"),
    ;


    private  Integer code;

    private String message;

    ResultEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }
}
