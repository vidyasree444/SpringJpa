package com.example.demo.JPA1;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class DetailsSevice{

    @Autowired
    DetailsRepository dr;


    public List<Details> Query(String name) {
        System.out.println("native query");
     return dr.findByName(name);
    }
    
}
