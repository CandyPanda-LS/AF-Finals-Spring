package com.example.demo.controller;

import com.example.demo.model.Calculator;
import com.example.demo.service.CatagoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class CalculatorController {

    @Autowired
    private CatagoryService categoryService;

    @PostMapping("api/calculator")
    public Double getCalculatedPrice(@RequestBody Calculator cal){
        return cal.getDuration() * categoryService.getCalculatedPrice(cal.getCatagotyID());
    }

}
