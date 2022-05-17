package ss999_ket_thuc_module.model;

import SmallJob.Utils.ReadAndWrite;

public class RealPhone extends ShopPhone{
    private int timeProtect;
    private String rangeProtect;
    public RealPhone(){};

    public RealPhone(int timeProtect, String rangeProtect) {
        this.timeProtect = timeProtect;
        this.rangeProtect = rangeProtect;
    }

    public RealPhone(int id, String name, int price, int num, String houseProduct, int timeProtect, String rangeProtect) {
        super(id, name, price, num, houseProduct);
        this.timeProtect = timeProtect;
        this.rangeProtect = rangeProtect;
    }

    public int getTimeProtect() {
        return timeProtect;
    }

    public void setTimeProtect(int timeProtect) {
        this.timeProtect = timeProtect;
    }

    public String getRangeProtect() {
        return rangeProtect;
    }

    public void setRangeProtect(String rangeProtect) {
        this.rangeProtect = rangeProtect;
    }
    public String convertLine(){
        String line = super.convertLine() + "," + this.timeProtect + "," + this.rangeProtect;
        return line;
    }
    @Override
    public String toString() {
        return super.toString() +
                "timeProtect=" + timeProtect +
                ", rangeProtect='" + rangeProtect + '\'' +
                '}';
    }
}
