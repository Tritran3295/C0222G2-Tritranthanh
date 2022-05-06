package keyStudy.model;

import java.util.Objects;

public abstract class Facility {
    private String tenDichVu;
    private String maDichVu;
    private String dienTichSuDung;
    private Double chiPhiThue;
    private Integer soLuongNguoiToiDa;
    private String kieuThue;

    public Facility() {
    }

    public Facility(String tenDichVu, String maDichVu, String dienTichSuDung, Double chiPhiThue, Integer soLuongNguoiToiDa, String kieuThue) {
        this.tenDichVu = tenDichVu;
        this.maDichVu = maDichVu;
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

    public String getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(String maDichVu) {
        this.maDichVu = maDichVu;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return Objects.equals(tenDichVu, facility.tenDichVu) && Objects.equals(maDichVu, facility.maDichVu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maDichVu);
    }

    @Override
    public String toString() {
        return "Facility{" +
                "tenDichVu='" + tenDichVu + '\'' +
                ", maDichVu='" + maDichVu + '\'' +
                ", dienTichSuDung='" + dienTichSuDung + '\'' +
                ", chiPhiThue=" + chiPhiThue +
                ", soLuongNguoiToiDa=" + soLuongNguoiToiDa +
                ", kieuThue='" + kieuThue + '\'' +
                '}';
    }

    public String convertLine() {
        String line = this.tenDichVu + "," +
                this.maDichVu + "," +
                this.dienTichSuDung + "," +
                this.chiPhiThue + "," +
                this.soLuongNguoiToiDa + "," +
                this.kieuThue;
        return line;

    }
}
