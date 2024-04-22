package com.example.demo.JPA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public void saveProducts(List<Product> products) {
        productRepository.saveAll(products);
    }
    
    public Page<Product> getAllProducts(int pageNumber, int pageSize,Sort sort /*int size*/) {
        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize,sort);//----> based on pagenumber and size and sorting give rows
        
        //PageRequest pageRequest = PageRequest.ofSize(size); //--->in one page how many rows u want
        return productRepository.findAll(pageRequest);
    }

    public Iterable<Product> getAll(Sort sort){
        return productRepository.findAll(sort);
    }

    public void printProducts(Page<Product> productsPage) {
        for (Product product : productsPage) {
            System.out.println(product);
        }
    }

    public void printall(Iterable<Product> its) {
        for (Product product : its) {
            System.out.println(product);
        }
    }
    public void printNextPage(Page<Product> currentPage) {
        printProducts(currentPage);
        if (currentPage.hasNext()) { 
            Pageable nextPageable = currentPage.nextPageable(); 
            Page<Product> nextPage = productRepository.findAll(nextPageable);
            printProducts(nextPage);
        } else {
            System.out.println("No next page available.");
        }
    }

    public void getProdName(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProdName'");
    }
    
}
