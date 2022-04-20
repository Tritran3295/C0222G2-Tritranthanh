package keyStudy.model;

public class Customer extends Person{
    private String maKhachHang;
    private String loaiKhach;
    private String diaChi;
    public Customer(){};

    public Customer(String maKhachHang, String loaiKhach, String diaChi) {
        this.maKhachHang = maKhachHang;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public Customer(String hoVaTen, Integer ngaySinh, String gioiTinh, Integer CMND, Integer soDienThoai, String email, String maKhachHang, String loaiKhach, String diaChi) {
        super(hoVaTen, ngaySinh, gioiTinh, CMND, soDienThoai, email);
        this.maKhachHang = maKhachHang;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
