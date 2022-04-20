package keyStudy.model;

public class Booking {
    private Integer maBook;
    private Integer ngayBatDau;
    private Integer ngayKetThuc;
    private Integer maKhachHang;
    private String tenDichVu;
    private String loaiDichVu;
    public Booking(){};

    public Booking(Integer maBook, Integer ngayBatDau, Integer ngayKetThuc, Integer maKhachHang, String tenDichVu, String loaiDichVu) {
        this.maBook = maBook;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.maKhachHang = maKhachHang;
        this.tenDichVu = tenDichVu;
        this.loaiDichVu = loaiDichVu;
    }

    public Integer getMaBook() {
        return maBook;
    }

    public void setMaBook(Integer maBook) {
        this.maBook = maBook;
    }

    public Integer getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Integer ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Integer getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Integer ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public Integer getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(Integer maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public String getLoaiDichVu() {
        return loaiDichVu;
    }

    public void setLoaiDichVu(String loaiDichVu) {
        this.loaiDichVu = loaiDichVu;
    }
}
