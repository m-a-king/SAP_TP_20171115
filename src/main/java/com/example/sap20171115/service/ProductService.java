package com.example.sap20171115.service;

import com.example.sap20171115.entity.Product;
import com.example.sap20171115.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    public final ProductRepository productRepository;
    public Product getProduct(int productId) {
        return productRepository.findByProductId(productId);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
