package com.example.sap20171115.service;

import com.example.sap20171115.entity.Product;
import com.example.sap20171115.entity.ProductImage;
import com.example.sap20171115.entity.Review;
import com.example.sap20171115.entity.Specification;
import com.example.sap20171115.repository.ProductImageRepository;
import com.example.sap20171115.repository.ProductRepository;
import com.example.sap20171115.repository.ReviewRepository;
import com.example.sap20171115.repository.SpecificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductImageRepository productImageRepository;
    private final SpecificationRepository specificationRepository;
    private final ReviewRepository reviewRepository;

    public Product getProduct(int productId) {
        return productRepository.findByProductId(productId);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public ProductImage getImage(int productId) {
        return productImageRepository.findByProductId(productId);
    }

    public List<ProductImage> getAllImages() {
        return productImageRepository.findAll();
    }

    public Specification getSpec(int productId){
        return specificationRepository.findByProductId(productId);
    }

    public List<Specification> getAllSpecs(){
        return specificationRepository.findAll();
    }

    public List<Review> getReview(int productId){
        return reviewRepository.findAllByProductId(productId);
    }


}
