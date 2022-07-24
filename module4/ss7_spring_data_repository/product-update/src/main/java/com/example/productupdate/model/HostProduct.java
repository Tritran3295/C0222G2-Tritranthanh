package com.example.productupdate.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class HostProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nameHostProduct;

    @JsonBackReference
    @OneToMany(mappedBy = "hostProduct")
    private List<Product> product;

    public HostProduct() {
    }

    public HostProduct(int id, String nameHostProduct, List<Product> product) {
        this.id = id;
        this.nameHostProduct = nameHostProduct;
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameHostProduct() {
        return nameHostProduct;
    }

    public void setNameHostProduct(String nameHostProduct) {
        this.nameHostProduct = nameHostProduct;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }
}
