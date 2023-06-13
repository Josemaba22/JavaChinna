package com.josemaba.jwtpractice.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.josemaba.jwtpractice.model.Product;
import com.josemaba.jwtpractice.repository.ProductRepository;
import com.josemaba.jwtpractice.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepo;
	
	@Override
	public Product save(Product product) {
		return productRepo.save(product);
	}

	@Override
	public void deleteById(Long id) {
		productRepo.deleteById(id);
	}

	@Override
	public Optional<Product> findById(Long id) {
		return productRepo.findById(id);
	}

	@Override
	public List<Product> findAll() {
		return productRepo.findAll();
	}

}
