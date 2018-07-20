package com.imooc.sell_shop.repository;

import com.imooc.sell_shop.dataobject.OrderDetail;
import com.imooc.sell_shop.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ Author     ：李华伟
 * @ Date       ：Created in 10:52 2018/7/20
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {
    List<OrderDetail> findByOrOrderId(String order);
}
