package com.example.sap20171115.repository;

import com.example.sap20171115.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
    Review findByProductId(int productId);
}
