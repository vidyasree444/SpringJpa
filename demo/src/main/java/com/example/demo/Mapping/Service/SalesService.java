package com.example.demo.Mapping.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Mapping.Entities.Product1;
import com.example.demo.Mapping.Entities.Sales1;
import com.example.demo.Mapping.Repository.SalesRepo;


@Service
public class SalesService {
    
    @Autowired
    SalesRepo salesRepo;
   
    public void getProducts(int prodId){
        List<Sales1> salesForProduct = salesRepo.findByProduct1ProdId(prodId);

        // Display the retrieved sales
        for (Sales1 sale : salesForProduct) {
            System.out.println(sale);
        }

        

    }
    public void printQty(int min, int max){
       List<Sales1> s =salesRepo.findByQtyBetween(min, max);
       for (Sales1 sale : s) {
        System.out.println(sale);
    }

    

    }
 public void getQty(){
    List<Sales1> sa = salesRepo.findByOrderByQtyAsc();

    for( Sales1 sales:sa){
    System.out.println(sales.toString());
    }
 }
 public void getSalesByAscOfQuantity(){
    Pageable page = PageRequest.of(0, 7,Sort.by("qty").and(Sort.by("price")));

    List<Sales1> sales = salesRepo.findAll(page).getContent();
    for(Sales1 p :sales){
        System.out.println(p);
    }
 }
 public void getSecondPage(){
    Pageable page = PageRequest.of(2, 4);

   List<Sales1> sales =salesRepo.findAll(page).getContent();

   for(Sales1 sa: sales){
    System.out.println(sa);
   }
 }
 public void getSales(){
    List<Sales1> sales = salesRepo.findAll();
    for(Sales1 sa: sales){
        System.out.println(sa);
    }
 }


}