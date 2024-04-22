package com.example.demo.JPA;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product,Integer> {
    void saveAll(Iterable<Product> products);
    
}
