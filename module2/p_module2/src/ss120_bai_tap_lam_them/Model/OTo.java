package ss120_bai_tap_lam_them.Model;

public class OTo extends TranSport{
    private Integer soChoNgoi;
    private String kieuXe;
    public void Oto(){}

    public OTo(Integer soChoNgoi, String kieuXe) {
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public OTo(String bienKiemSoat, String tenHangSanXuat, Integer namSanXuat, String chuSoHuu, Integer soChoNgoi, String kieuXe) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }
}
