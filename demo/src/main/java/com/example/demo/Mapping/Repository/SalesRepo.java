package com.example.demo.Mapping.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Mapping.Entities.Product1;
import com.example.demo.Mapping.Entities.Sales1;

import jakarta.transaction.Transactional;



@Repository

public interface SalesRepo extends JpaRepository<Sales1,Integer> {

    List<Sales1> findByProduct1ProdId(int prodId);
    List<Sales1> findByQtyBetween(int min, int max);
    List<Sales1> findByOrderByQtyAsc();

    
   

}