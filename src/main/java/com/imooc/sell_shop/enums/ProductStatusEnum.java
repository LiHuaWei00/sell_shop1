package com.imooc.sell_shop.enums;

import lombok.Getter;

/**
 * @ Author     ：李华伟
 * @ Date       ：Created in 16:20 2018/7/19
 * 商品状态
 */
@Getter
public enum ProductStatusEnum {

    UP(0,"在架"),
    DOWN(1,"下架")
    ;
    private Integer code;
    private String message;
    ProductStatusEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }
}
