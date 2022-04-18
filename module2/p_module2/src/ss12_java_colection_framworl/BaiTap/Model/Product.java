package ss12_java_colection_framworl.BaiTap.Model;

public class Product {
    private Integer id;
    private String tenSanPham;
    private Integer ngaySanXuat;
    private Integer giaBan;
    public Product(){};

    public Product(Integer id, String tenSanPham, Integer ngaySanXuat, Integer giaBan) {
        this.id = id;
        this.tenSanPham = tenSanPham;
        this.ngaySanXuat = ngaySanXuat;
        this.giaBan = giaBan;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public Integer getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(Integer ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public Integer getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Integer giaBan) {
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return
                "id = " + id +
                ",Tên sản phẩm : " + tenSanPham + '\'' +
                ", Ngày sản xuất : " + ngaySanXuat +
                ",Giá bán : " + giaBan
                ;
    }
}
