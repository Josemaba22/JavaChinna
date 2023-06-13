package com.josemaba.jwtpractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.josemaba.jwtpractice.model.Product;

@Repository
public interface ProductRepository extends JpaRepository< Product, Long>  {

	
}
