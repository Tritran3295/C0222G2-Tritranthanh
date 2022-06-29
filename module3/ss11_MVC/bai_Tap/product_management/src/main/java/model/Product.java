package model;

public class Product {
    private int id;
    private String name;
    private String manufactor;
    private double price;
    private String detailProduct;

    public Product() {
    }

    public Product(int id, String name, String manufactor, double price, String detailProduct) {
        this.id = id;
        this.name = name;
        this.manufactor = manufactor;
        this.price = price;
        this.detailProduct = detailProduct;
    }

    public Product(String name, String manufactor, Double price, String detailProduct) {
        this.name = name;
        this.manufactor = manufactor;
        this.price = price;
        this.detailProduct = detailProduct;
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

    public String getManufactor() {
        return manufactor;
    }

    public void setManufactor(String manufactor) {
        this.manufactor = manufactor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDetailProduct() {
        return detailProduct;
    }

    public void setDetailProduct(String detailProduct) {
        this.detailProduct = detailProduct;
    }
}
