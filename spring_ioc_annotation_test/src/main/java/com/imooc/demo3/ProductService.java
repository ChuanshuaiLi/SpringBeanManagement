package com.imooc.demo3;

import javax.annotation.Resource;

public class ProductService {

    @Resource(name = "categoryDao")
    private CategoryDao categoryDao;
    @Resource(name = "productDao")
    private ProductDao productDao;

//    public void setCategoryDao(CategoryDao categoryDao) {
//        this.categoryDao = categoryDao;
//    }
//
//    public void setProductDao(ProductDao productDao) {
//        this.productDao = productDao;
//    }

    public void save(){
        System.out.println("ProductService的save方法执行了");
        categoryDao.save();
        productDao.save();
    }
}
