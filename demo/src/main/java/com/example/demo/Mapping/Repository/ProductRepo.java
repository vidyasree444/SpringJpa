package com.example.demo.Mapping.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.demo.Mapping.Entities.Product1;



@Component
public interface ProductRepo extends JpaRepository<Product1,Integer>{
     @Query("select p.prodName,p.qty from Product1 p where p.prodId= ?1")
     List<Object[]> getProdnameAndQuantity(int prodId);

     @Query("select p.prodName,p.qty from Product1 p where p.prodName = :prodName")
     List<Object[]> getProdName(@Param("prodName")String prodName);
 }
    
