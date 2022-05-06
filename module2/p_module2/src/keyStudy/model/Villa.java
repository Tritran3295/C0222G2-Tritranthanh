package keyStudy.model;

public class Villa extends Facility {
    private String tieuChuanPhong;
    private String dienTichHoBoi;
    private Integer soTang;
    public Villa(){};

    public Villa(String tieuChuanPhong, String dienTichHoBoi, Integer soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public Villa(String tenDichVu, String maDichVu, String dienTichSuDung, Double chiPhiThue, Integer soLuongNguoiToiDa, String kieuThue, String tieuChuanPhong, String dienTichHoBoi, Integer soTang) {
        super(tenDichVu, maDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(String dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public Integer getSoTang() {
        return soTang;
    }

    public void setSoTang(Integer soTang) {
        this.soTang = soTang;
    }

    public String convertLine() {
        return super.convertLine() + "," + this.tieuChuanPhong + "," + this.dienTichHoBoi + "," + this.soTang;
    }

    @Override
    public String toString() {
        return "Villa{" +
                super.toString() +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", dienTichHoBoi='" + dienTichHoBoi + '\'' +
                ", soTang=" + soTang +
                '}';
    }
}
