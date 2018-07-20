package com.imooc.sell_shop.repository;

import com.imooc.sell_shop.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ Author     ：李华伟
 * @ Date       ：Created in 10:23 2018/7/19
 */

public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
