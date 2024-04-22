package com.example.demo.JPA;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	@Autowired
    private ProductService ps;

	// @Autowired
	// Product p;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Product> pl = new ArrayList<>();

		pl.add(new Product( 1,"p1",2000));
		pl.add(new Product(2,"p2",3000));
		pl.add(new Product(3,"p3",4000));
		pl.add(new Product(4,"p4",4500));
		pl.add(new Product(5,"p5",5000));
		pl.add(new Product(6,"p6",4000));
		pl.add(new Product(7,"p7",4900));

		ps.saveProducts(pl);

		//===========================================
		int pageNumber =0; 
        int pageSize = 7; 

		Sort sort = Sort.by("id").ascending();

       // int size=4;		
	 
	   Page<Product> productsPage = ps.getAllProducts(pageNumber, pageSize,sort /*size*/);
	   ps.printProducts(productsPage); 

        System.out.println("------------------------------------");

		Iterable<Product> it=ps.getAll(Sort.by("price").descending());
		ps.printNextPage(productsPage);
		ps.printall(it);
		System.out.println("saved");
		System.out.println("----------pagebale interface---------");

		//Page<Product> productsPage = ps.getAllProducts(pageNumber, pageSize,sort /*size*/);
		//ps.printNextPage(productsPage);
	  
	}

       
	}
