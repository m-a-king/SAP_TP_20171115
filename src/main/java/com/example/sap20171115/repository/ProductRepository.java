package com.example.sap20171115.repository;

import com.example.sap20171115.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

     Product findByProductId(int productId);
}
