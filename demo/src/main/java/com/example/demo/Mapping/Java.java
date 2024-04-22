package com.example.demo.Mapping;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.JPA.ProductService;
import com.example.demo.Mapping.Entities.Product1;
import com.example.demo.Mapping.Entities.Sales1;
import com.example.demo.Mapping.Repository.ProductRepo;
import com.example.demo.Mapping.Repository.SalesRepo;
import com.example.demo.Mapping.Service.SalesService;


@SpringBootApplication
public class Java implements CommandLineRunner {
	@Autowired
    ProductRepo productRepo;
	@Autowired
	SalesRepo salesRepo;
	@Autowired
	SalesService salesService;
	// @Autowired
    // ProductService productService;
	
	public static void main(String[] args) {
		SpringApplication.run(Java.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Success");
	/*  Product1 p1 = new Product1( 0, "Laptop", 50000L, 1, "good", 8.0, null);
	 Product1 p2 = new Product1( 0, "Samsung", 20000L, 1, "nice", 3.0, null);
	 Product1 p3 = new Product1( 0, "Iphone", 70000L, 1, "Excelent", 5.0, null);
	 Product1 p4 = new Product1( 0, "Tab", 12000L, 1, "good", 8.0, null);
	 Product1 p5 = new Product1( 0, "Samsung", 20000L, 1, "Excelent", 3.0, null);
	Product1 p6 = new Product1( 0, "Samsung", 20000L, 2, "Excelent", 3.0, null);
	Product1 p7= new Product1( 0, "Apple", 600000L, 6, "Excelent", 3.0,null );
    */

	//productRepo.save(p7);

	/*productRepo.saveAll(Arrays.asList(p1,p2,p3,p4,p5,p6,p7));
	Sales1 s1 = new Sales1( 0,20,3000000000L, p1);
	Sales1 s2 = new Sales1(0, 20,3000000000L, p2);
	Sales1 s3 = new Sales1(0, 20,3000000000L, p3);
	Sales1 s4 = new Sales1(0, 20,3000000000L, p4);
	Sales1 s5 = new Sales1(0, 20,3000000000L, p5);
	Sales1 s6 = new Sales1(0, 20,3000000000L, p6);
	Sales1 s7 = new Sales1(0, 50,3000000000L, p7);
    */

	//salesRepo.save(s7);

	//salesRepo.saveAll(Arrays.asList(s1,s2,s3,s4,s5,s6,s7));
    
	salesService.getProducts(1);
	// salesService.printQty(1,20);
	// salesService.getQty();
	// salesService.getSalesByAscOfQuantity();
	// salesService.getSecondPage();
	// salesService.getSales();
	// productRepo.deleteAll();

	// productService.getAllProducts();
    // productService.getProdnameAndQuantity(1);
	//productService.getProdName("Laptop");
	}

}