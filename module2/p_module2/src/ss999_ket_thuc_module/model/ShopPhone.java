package ss999_ket_thuc_module.model;

public abstract class ShopPhone {
    private int id;
    private String name;
    private int price;
    private int num;
    private String houseProduct;
    public ShopPhone(){};

    public ShopPhone(int id, String name, int price, int num, String houseProduct) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.num = num;
        this.houseProduct = houseProduct;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getHouseProduct() {
        return houseProduct;
    }

    public void setHouseProduct(String houseProduct) {
        this.houseProduct = houseProduct;
    }
    public String convertLine(){
        String line = this.id + ","+this.name + "," + this.price + "," + this.num + "," + this.houseProduct;
        return line;
    }
    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", num=" + num +
                ", houseProduct='" + houseProduct + '\'' +
                '}';
    }
}
