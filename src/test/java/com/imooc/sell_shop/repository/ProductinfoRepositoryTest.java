package com.imooc.sell_shop.repository;

import com.imooc.sell_shop.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @ Author     ：李华伟
 * @ Date       ：Created in 15:45 2018/7/19
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductinfoRepositoryTest {
    @Autowired
    private ProductinfoRepository repository;
    @Test
    public void saveTest(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123456");
        productInfo.setProductName("八宝粥");
        productInfo.setProductPrice(new BigDecimal(3.0));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("很好喝的粥");
        productInfo.setProductIcon("http://xxxxx.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(2);
        ProductInfo result = repository.save(productInfo);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByProductStatus() {
       List<ProductInfo> productInfos =  repository.findByProductStatus(0);
       Assert.assertNotEquals(0,productInfos.size());
    }
}