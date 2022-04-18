package ss120_bai_tap_lam_them.Model;

public abstract class TranSport {
    private String bienKiemSoat;
    private String tenHangSanXuat;
    private Integer namSanXuat;
    private String chuSoHuu;
    public TranSport(){};

    public TranSport(String bienKiemSoat, String tenHangSanXuat, Integer namSanXuat, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.tenHangSanXuat = tenHangSanXuat;
        this.namSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public Integer getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(Integer namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    @Override
    public String toString() {
        return
                "Biển kiểm soát : " + bienKiemSoat + '\'' +
                ", Tên hãng sản xuất : " + tenHangSanXuat + '\'' +
                ", Năm sản xuất : " + namSanXuat +
                ", Chủ sở hữu : " + chuSoHuu + '\''
               ;
    }
}
