package com.example.model;



import com.example.model.enums.CarStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String registrationNumber;  // Unique identifier (e.g., TN09AB1234)

    private String brand;               // e.g., Honda, Hyundai


    @Enumerated(EnumType.STRING)
    private CarStatus status;           // IDLE, ON_LEASE, IN_SERVICE

    @ManyToOne
    @JoinColumn(name = "owner_id")  // optional, for explicit FK
    private CarOwner owner;                // Reference to Car Owner

    // Constructors, Getters, Setters
}
