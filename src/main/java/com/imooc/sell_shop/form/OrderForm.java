package com.imooc.sell_shop.form;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @ Author     ：李华伟
 * @ Date       ：Created in 9:59 2018/7/24
 */
@Data
public class OrderForm {
    //买家姓名
    @NotEmpty(message = "姓名必填")
    private String name;
    @NotEmpty(message = "手机号必填")
    private String phone;
    @NotEmpty(message = "地址必填")
    private String address;
    //买家微信openid
    @NotEmpty(message = "openid必填")
    private String openid;
    @NotEmpty(message = "购物车不能为空")
    private String items;

}
