package com.example.demo.service;

import com.example.demo.model.Catagory;
import com.example.demo.repository.CatagoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CatagoryService {

    @Autowired
    private CatagoryRepository categoryRepository;

    public Double getCalculatedPrice(String id) {
        System.out.println(id);
        Optional<Catagory> category = categoryRepository.findById(id);
        if (category.isPresent()) {
//            System.out.println("if");
            return category.get().getPrice();
        } else {
//            System.out.println("else");

            return 0.0;
        }

    }



}
