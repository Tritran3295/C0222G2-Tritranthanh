package model;

public class Product {
    private Integer idProduct;
    private String nameProduct;
    private Integer priceProduct;
    private String describeProduct;
    private String hostProduct;

    public Product() {
    }

    public Product(Integer idProduct, String nameProduct, Integer priceProduct, String describeProduct, String hostProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.describeProduct = describeProduct;
        this.hostProduct = hostProduct;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Integer getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(Integer priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getDescribeProduct() {
        return describeProduct;
    }

    public void setDescribeProduct(String describeProduct) {
        this.describeProduct = describeProduct;
    }

    public String getHostProduct() {
        return hostProduct;
    }

    public void setHostProduct(String hostProduct) {
        this.hostProduct = hostProduct;
    }
}
