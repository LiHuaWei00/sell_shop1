package com.imooc.sell_shop.service;

import com.imooc.sell_shop.dataobject.ProductInfo;
import com.imooc.sell_shop.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;

/**
 * @ Author     ：李华伟
 * @ Date       ：Created in 16:15 2018/7/19
 */
public interface ProductService {
    ProductInfo findOne(String productId);

    //查询所有在架商品列表
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存
    void increaseStock(List<CartDTO> cartDTOList);

    //减库存
    void decreaseStock(List<CartDTO> cartDTOList);
}
