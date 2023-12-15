package com.example.sap20171115.repository;

import com.example.sap20171115.entity.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecificationRepository extends JpaRepository<Specification, Integer> {
    Specification findByProductId(int productId);
}
