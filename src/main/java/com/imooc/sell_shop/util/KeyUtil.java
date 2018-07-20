package com.imooc.sell_shop.util;

import java.util.Random;

/**
 * @ Author     ：李华伟
 * @ Date       ：Created in 13:19 2018/7/20
 */
public class KeyUtil {
    //生成唯一的主键
    //格式：时间+随机数
    //synchronized加锁  谁请求到资源谁先用  不加的话可能会同时产生相同的ID
    public static synchronized String genUniqueKey(){
        Random random = new Random();

        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() +String.valueOf(number);
    }
}
