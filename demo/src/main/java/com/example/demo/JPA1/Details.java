package com.example.demo.JPA1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Details {
    @Id
    private int id;
    private String name;
    public Details() {
    }
    public Details(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Details [id=" + id + ", name=" + name + "]";
    }

    

}
