package keyStudy.model;

public abstract class Facility {
    private String tenDichVu;
    private String dienTichSuDung;
    private Double chiPhiThue;
    private Integer soLuongNguoiToiDa;
    private String kieuThue;
    public Facility(){};

    public Facility(String tenDichVu, String dienTichSuDung, Double chiPhiThue, Integer soLuongNguoiToiDa, String kieuThue) {
        this.tenDichVu = tenDichVu;
        this.dienTichSuDung = dienTichSuDung;
        this.chiPhiThue = chiPhiThue;
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
        this.kieuThue = kieuThue;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public String getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(String dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public Double getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(Double chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public Integer getSoLuongNguoiToiDa() {
        return soLuongNguoiToiDa;
    }

    public void setSoLuongNguoiToiDa(Integer soLuongNguoiToiDa) {
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    @Override
    public String toString() {
        return
                "Tên dịch vụ : " + tenDichVu + '\'' +
                ", Diện tích sử dụng : " + dienTichSuDung + '\'' +
                ", Chi phí thuê : " + chiPhiThue +
                ", Số lượng người tối đa : " + soLuongNguoiToiDa +
                ", Kiểu thuê : " + kieuThue + '\''
                ;
    }
}
