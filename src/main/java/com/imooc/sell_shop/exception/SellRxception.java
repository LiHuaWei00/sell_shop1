package com.imooc.sell_shop.exception;

import com.imooc.sell_shop.enums.ResultEnum;

/**
 * @ Author     ：李华伟
 * @ Date       ：Created in 11:28 2018/7/20
 */
public class SellRxception extends RuntimeException {

    private Integer code;

    public SellRxception(ResultEnum resultEnum){
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }
    public SellRxception(Integer code,String message){
        super(message);
        this.code = code;
    }

}
