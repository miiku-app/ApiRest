package com.example.restapi.repository;


import com.example.restapi.domain.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ProductRepository extends MongoRepository<Product, Integer> {

}