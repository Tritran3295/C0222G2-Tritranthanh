package keyStudy.model;

public class Employee extends Person{
    private String maNhanVien;
    private String trinhDo;
    private String viTri;
    private Double luong;
    public Employee(){};

    public Employee(String maNhanVien, String trinhDo, String viTri, Double luong) {
        this.maNhanVien = maNhanVien;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public Employee(String hoVaTen, Integer ngaySinh, String gioiTinh, Integer CMND, Integer soDienThoai, String email, String maNhanVien, String trinhDo, String viTri, Double luong) {
        super(hoVaTen, ngaySinh, gioiTinh, CMND, soDienThoai, email);
        this.maNhanVien = maNhanVien;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public Double getLuong() {
        return luong;
    }

    public void setLuong(Double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Mã nhân viên : " + maNhanVien + '\'' +
                ", Trình độ : " + trinhDo + '\'' +
                ", Vị trí : " + viTri + '\'' +
                ", Lương : " + luong
                ;
    }
}
