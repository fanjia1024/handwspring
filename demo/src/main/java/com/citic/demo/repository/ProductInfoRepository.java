package com.citic.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.citic.demo.dataobject.ProductInfo;

public interface ProductInfoRepository extends JpaRepository<ProductInfo, String>{

	 List<ProductInfo> findByProductStatus(Integer productStatus);
}