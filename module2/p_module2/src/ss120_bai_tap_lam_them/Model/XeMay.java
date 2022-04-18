package ss120_bai_tap_lam_them.Model;

public class XeMay extends TranSport{
    private Integer congXuat;
    public XeMay(){}

    public XeMay(Integer congXuat) {
        this.congXuat = congXuat;
    }

    public XeMay(String bienKiemSoat, String tenHangSanXuat, Integer namSanXuat, String chuSoHuu, Integer congXuat) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.congXuat = congXuat;
    }

    public Integer getCongXuat() {
        return congXuat;
    }

    public void setCongXuat(Integer congXuat) {
        this.congXuat = congXuat;
    }
}
