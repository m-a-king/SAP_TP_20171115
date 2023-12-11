package com.example.sap20171115.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Specification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int specId;

    private int productId;
    private String processor;
    private String memory;
    private String storage;
    private String display;
    private String color;
    private String battery;
    private String camera;
    private String os;
}