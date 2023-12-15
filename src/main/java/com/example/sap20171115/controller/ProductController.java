package com.example.sap20171115.controller;

import com.example.sap20171115.entity.Product;
import com.example.sap20171115.entity.ProductImage;
import com.example.sap20171115.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class ProductController {

    private final ProductService productService;

    @GetMapping("/product/{productIdx}")
    public Product getProduct(@PathVariable("productIdx") int productIdx) {
        return productService.getProduct(productIdx);
    }

    @GetMapping("/product/all")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/image/{productIdx}")
    public ProductImage getImage(@PathVariable("productIdx") int productIdx) {
        return productService.getImage(productIdx);
    }

    @GetMapping("/image/all")
    public List<ProductImage> getAllImages(){
        return productService.getAllImages();
    }

}
