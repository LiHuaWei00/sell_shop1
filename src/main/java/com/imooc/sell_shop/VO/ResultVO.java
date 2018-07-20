package com.imooc.sell_shop.VO;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * @ Author     ：李华伟
 * @ Date       ：Created in 16:58 2018/7/19
 */
@Data
public class ResultVO<T> {
    private Integer code;
    private String message;
    private T data;
}
