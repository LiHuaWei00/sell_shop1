package com.imooc.sell_shop.enums;

import lombok.Getter;

/**
 * @ Author     ：李华伟
 * @ Date       ：Created in 10:21 2018/7/20
 */
@Getter
public enum  PayStatusEnum {
    WAIT(0,"未支付"),
    SUCCESS(1,"支付成功");
    private  Integer code;
    private String message;
    PayStatusEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }

}
