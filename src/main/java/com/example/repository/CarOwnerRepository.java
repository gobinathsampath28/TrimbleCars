package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.CarOwner;

@Repository
public interface CarOwnerRepository extends CrudRepository<CarOwner,Long>{

}
