package com.bhl.ehotel.price.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhl.ehotel.price.mapper.ProductPriceMapper;
import com.bhl.ehotel.price.model.ProductPrice;
import com.bhl.ehotel.price.service.ProductPriceService;

@Service
public class ProductPriceServiceImpl implements ProductPriceService {

	@Autowired
	private ProductPriceMapper productPriceMapper;
	
	public void add(ProductPrice productPrice) {
		productPriceMapper.add(productPrice); 
	}

	public void update(ProductPrice productPrice) {
		productPriceMapper.update(productPrice); 
	}

	public void delete(Long id) {
		productPriceMapper.delete(id); 
	}

	public ProductPrice findById(Long id) {
		return productPriceMapper.findById(id);
	}

}
