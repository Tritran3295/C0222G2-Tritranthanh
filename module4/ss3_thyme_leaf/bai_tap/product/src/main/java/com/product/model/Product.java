package com.product.model;

public class Product {
    private int id;
    private String nameProduct;
    private double price;
    private String decribe;
    private String hostProduct;

    public Product() {
    }

    public Product(int id, String nameProduct, double price, String decribe, String hostProduct) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
        this.decribe = decribe;
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

    public String getDecribe() {
        return decribe;
    }

    public void setDecribe(String decribe) {
        this.decribe = decribe;
    }

    public String getHostProduct() {
        return hostProduct;
    }

    public void setHostProduct(String hostProduct) {
        this.hostProduct = hostProduct;
    }
}
