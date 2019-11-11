package com.citic.demo.service;

import com.citic.demo.dataobject.ProductCategory;


import java.util.List;

public interface CategoryService {


    /**
     *
     * @param categoryTypeList
     * @return 实体类的List
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);


}
