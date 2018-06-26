package com.fengdu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fengdu.dao.ProductMapper;
import com.fengdu.entity.Product;
import com.fengdu.entity.ProductExample;
import com.fengdu.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductMapper productMapper;
	
	@Override
	public List<Product> getProducts() {
		
		ProductExample pe = new ProductExample();
//		Criteria pc = pe.createCriteria();
		List<Product> list = productMapper.selectByExample(pe);
		
		return list;
	}

	@Override
	public Product getProductById(String productId) {
		
		return productMapper.selectByPrimaryKey(productId);
	}

}
