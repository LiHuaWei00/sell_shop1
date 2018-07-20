package com.imooc.sell_shop.service;

import com.imooc.sell_shop.dataobject.ProductCategory;

import java.util.List;

/**
 * @ Author     ：李华伟
 * @ Date       ：Created in 11:41 2018/7/19
 */
public interface CategoryService {
    ProductCategory findOne(Integer categoryId);
    List<ProductCategory> findAll();
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
    ProductCategory save(ProductCategory productCategory);
}
