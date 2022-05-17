package ss999_ket_thuc_module.model;

public class HandPhone extends ShopPhone {
    private String nationHand;
    private String behavior;
    public HandPhone(){};

    public HandPhone(String nationHand, String behavior) {
        this.nationHand = nationHand;
        this.behavior = behavior;
    }

    public HandPhone(int id, String name, int price, int num, String houseProduct, String nationHand, String behavior) {
        super(id, name, price, num, houseProduct);
        this.nationHand = nationHand;
        this.behavior = behavior;
    }

    public String getNationHand() {
        return nationHand;
    }

    public void setNationHand(String nationHand) {
        this.nationHand = nationHand;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }
    public String convertLine(){
        String line = super.convertLine() + "," + this.nationHand + "," + this.behavior;
        return line;
    }
    @Override
    public String toString() {
        return super.toString() +
                "nationHand='" + nationHand + '\'' +
                ", behavior='" + behavior + '\'' +
                '}';
    }
}
