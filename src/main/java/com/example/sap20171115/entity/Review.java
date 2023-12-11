package com.example.sap20171115.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reviewId;

    private int productId;
    private String reviewer;
    private int rating;
    private String comment;
}