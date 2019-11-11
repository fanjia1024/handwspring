package com.citic.demo.service.impl;


import com.citic.demo.dataobject.ProductInfo;
import com.citic.demo.repository.ProductInfoRepository;
import com.citic.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * productservice实现类
 */
@Service
//@CacheConfig(cacheNames = "product")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository repository;




    @Override
    public List<ProductInfo> findUpAll() {
        return repository.findByProductStatus(0);
    }




}
