package com.example.demo.Mapping.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Sales1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int invoNO;
   
    @Column(name="Quantity")
    private int qty;
    @Column(name="Price")
    private Long price;

    @ManyToOne
    @JoinColumn(name="prodId")
    private Product1 product1;

    public Sales1() {
    }

    public Sales1(int invoNO, int qty, Long price, Product1 product1) {
        this.invoNO = invoNO;
        this.qty = qty;
        this.price = price;
        this.product1 = product1;
    }

    public int getInvoNO() {
        return invoNO;
    }

    public void setInvoNO(int invoNO) {
        this.invoNO = invoNO;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Product1 getProduct1() {
        return product1;
    }

    public void setProduct1(Product1 product1) {
        this.product1 = product1;
    }

    @Override
    public String toString() {
        return "Sales1 [invoNO=" + invoNO + ", qty=" + qty + ", price=" + price + ", product1=" + product1 + "]";
    }

    
}
