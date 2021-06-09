package com.example.demo.repository;
import com.example.demo.model.Catagory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatagoryRepository extends MongoRepository<Catagory,String> {
}
