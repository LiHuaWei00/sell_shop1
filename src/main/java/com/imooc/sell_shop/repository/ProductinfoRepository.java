package com.imooc.sell_shop.repository;

import com.imooc.sell_shop.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;

/**
 * @ Author     ：李华伟
 * @ Date       ：Created in 15:42 2018/7/19
 */
public interface ProductinfoRepository extends JpaRepository<ProductInfo,String> {

    List<ProductInfo> findByProductStatus(Integer productStats);


}
