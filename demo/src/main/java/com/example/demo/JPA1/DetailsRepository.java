package com.example.demo.JPA1;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface DetailsRepository extends JpaRepository<Details,Integer> {
    public List<Details> findByName(String name);

    @Query("SELECT d FROM Details d WHERE d.name = :name")
    List<Details> findByName1(@Param("name") String name);
    
}
