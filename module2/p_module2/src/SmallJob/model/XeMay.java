package SmallJob.model;

public class XeMay extends PhuongTien{
    private int congXuat;
    public XeMay(){};

    public XeMay(int congXuat) {
        this.congXuat = congXuat;
    }

    public XeMay(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, int congXuat) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.congXuat = congXuat;
    }

    public int getCongXuat() {
        return congXuat;
    }

    public void setCongXuat(int congXuat) {
        this.congXuat = congXuat;
    }

    @Override
    public String toString() {
        return super.toString() +
                "congXuat=" + congXuat +
                '}';
    }
}
