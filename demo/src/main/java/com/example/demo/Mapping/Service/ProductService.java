package com.example.demo.Mapping.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.Mapping.Entities.Product1;
import com.example.demo.Mapping.Repository.ProductRepo;

@Service
public class ProductService {
        @Autowired
        ProductRepo productRepo;

        public void getAllProducts(){
            List<Product1> pro = productRepo.findAll();

            for(Product1 products:pro){
                System.out.println(products.toString());
            }
        }
        public void getProdnameAndQuantity(int prodId){
            List<Object[]> products = productRepo.getProdnameAndQuantity(prodId);
            for(Object[] pro : products){
                System.out.println(pro[0]+" "+pro[1]);
            }
        
        
        }
        public void getProdName(String prodName){
            List<Object[]> pro = productRepo.getProdName(prodName);
            for(Object[] product: pro){
                System.out.println(product[0]+" " + product[1]);
            }
        }
    }
