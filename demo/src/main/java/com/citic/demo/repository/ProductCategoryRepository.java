package com.citic.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.citic.demo.dataobject.ProductCategory;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer>{

	List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
	
}
