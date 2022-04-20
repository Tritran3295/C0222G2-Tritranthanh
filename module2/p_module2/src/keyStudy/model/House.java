package keyStudy.model;

public class House extends Facility{
    private String tieuChuanPhong;
    private Integer soTang;
    public House(){};

    public House(String tieuChuanPhong, Integer soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public House(String tenDichVu, String dienTichSuDung, Double chiPhiThue, Integer soLuongNguoiToiDa, String kieuThue, String tieuChuanPhong, Integer soTang) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public Integer getSoTang() {
        return soTang;
    }

    public void setSoTang(Integer soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return
                "Tiêu chuẩn phòng : " + tieuChuanPhong + '\'' +
                ", Số tầng :" + soTang
                ;
    }
}
