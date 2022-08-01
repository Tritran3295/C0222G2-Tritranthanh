package com.productvalidate.model;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nameProduct;
    private double price;
    private String describeProduct;
    @ManyToOne
    @JoinColumn(name = "id_host_product", referencedColumnName = "id")
    private HostProduct hostProduct;

    public Product() {
    }

    public Product(int id, String nameProduct, double price, String describeProduct, HostProduct hostProduct) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
        this.describeProduct = describeProduct;
        this.hostProduct = hostProduct;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescribeProduct() {
        return describeProduct;
    }

    public void setDescribeProduct(String describeProduct) {
        this.describeProduct = describeProduct;
    }

    public HostProduct getHostProduct() {
        return hostProduct;
    }

    public void setHostProduct(HostProduct hostProduct) {
        this.hostProduct = hostProduct;
    }
}
