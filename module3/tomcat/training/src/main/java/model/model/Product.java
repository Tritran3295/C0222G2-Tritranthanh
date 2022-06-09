package model.model;

import java.util.List;

public class Product {
    private Integer stt;
    private String nameProduct;
    private String detailProduct;
    private String dateOfManufacture;
    private String manufacturer;
    private String countryProduct;

    public Product() {
    }

    public Product(Integer stt, String nameProduct, String detailProduct, String dateOfManufacture, String manufacturer, String countryProduct) {
        this.stt = stt;
        this.nameProduct = nameProduct;
        this.detailProduct = detailProduct;
        this.dateOfManufacture = dateOfManufacture;
        this.manufacturer = manufacturer;
        this.countryProduct = countryProduct;
    }

    public Integer getStt() {
        return stt;
    }

    public void setStt(Integer stt) {
        this.stt = stt;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getDetailProduct() {
        return detailProduct;
    }

    public void setDetailProduct(String detailProduct) {
        this.detailProduct = detailProduct;
    }

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCountryProduct() {
        return countryProduct;
    }

    public void setCountryProduct(String countryProduct) {
        this.countryProduct = countryProduct;
    }
}
