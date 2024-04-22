package com.example.demo.Mapping.Entities;



import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Product1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Prod_Id")
    private int prodId;
    @Column(name="Prod_Name")
    private String prodName;
    @Column(name="Price")
    private Long price;
    @Column(name="Quantity")
    private int qty;
    @Column(name="Remarks")
    private String remarks;
    @Column(name="Tax_rate")
    private Double taxRate;

    @OneToMany(cascade  = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Sales1> sales1;

    public Product1() {
    }

    public Product1(int prodId, String prodName, Long price, int qty, String remarks, Double taxRate,
            List<Sales1> sales1) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
        this.qty = qty;
        this.remarks = remarks;
        this.taxRate = taxRate;
        this.sales1 = sales1;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public List<Sales1> getSales1() {
        return sales1;
    }

    public void setSales1(List<Sales1> sales1) {
        this.sales1 = sales1;
    }

    @Override
    public String toString() {
        return "Product1 [prodId=" + prodId + ", prodName=" + prodName + ", price=" + price + ", qty=" + qty
                + ", remarks=" + remarks + ", taxRate=" + taxRate + ", sales1=" + sales1 + "]";
    }

    
    


}