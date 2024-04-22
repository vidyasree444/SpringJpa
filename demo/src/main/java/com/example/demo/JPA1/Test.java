package com.example.demo.JPA1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Test implements CommandLineRunner {

    @Autowired
    private DetailsSevice ds;

    @Autowired
    private DetailsRepository dr;

    public static void main(String[] args) {
        SpringApplication.run(Test.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Details[] details = {
                new Details(1, "vidya"),
                new Details(2, "sree"),
                new Details(3, "dhupam")
        };

        dr.saveAll(Arrays.asList(details));
        ds.Query("vidya");
    }
}
