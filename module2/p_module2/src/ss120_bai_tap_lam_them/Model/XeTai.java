package ss120_bai_tap_lam_them.Model;

public class XeTai extends TranSport{
    private Double trongTai;
    public XeTai(){}

    public XeTai(Double trongTai) {
        this.trongTai = trongTai;
    }

    public XeTai(String bienKiemSoat, String tenHangSanXuat, Integer namSanXuat, String chuSoHuu, Double trongTai) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public Double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(Double trongTai) {
        this.trongTai = trongTai;
    }
}
