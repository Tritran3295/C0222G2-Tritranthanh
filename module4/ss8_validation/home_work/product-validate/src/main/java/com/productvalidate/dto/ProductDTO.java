package com.productvalidate.dto;

import com.productvalidate.model.HostProduct;

import javax.validation.constraints.*;

public class ProductDTO {
    private int id;
    @NotNull
    @NotEmpty
    @NotBlank
    @Size(min = 2, max = 100)
    private String nameProduct;

    @Min(1)
    private double price;

    @NotEmpty
    @NotBlank
    private String describeProduct;

    @NotNull
    private HostProduct hostProduct;

    public ProductDTO() {
    }

    public ProductDTO(int id, String nameProduct, double price, String describeProduct, HostProduct hostProduct) {
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
