package keyStudy.model;

public class Contract {
    private Integer soHopDong;
    private Integer maBooking;
    private Integer tienCoc;
    private Integer tongTienThanhToan;
    private Integer maKhachHang;
    public Contract(){};

    public Contract(Integer soHopDong, Integer maBooking, Integer tienCoc, Integer tongTienThanhToan, Integer maKhachHang) {
        this.soHopDong = soHopDong;
        this.maBooking = maBooking;
        this.tienCoc = tienCoc;
        this.tongTienThanhToan = tongTienThanhToan;
        this.maKhachHang = maKhachHang;
    }

    public Integer getSoHopDong() {
        return soHopDong;
    }

    public void setSoHopDong(Integer soHopDong) {
        this.soHopDong = soHopDong;
    }

    public Integer getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(Integer maBooking) {
        this.maBooking = maBooking;
    }

    public Integer getTienCoc() {
        return tienCoc;
    }

    public void setTienCoc(Integer tienCoc) {
        this.tienCoc = tienCoc;
    }

    public Integer getTongTienThanhToan() {
        return tongTienThanhToan;
    }

    public void setTongTienThanhToan(Integer tongTienThanhToan) {
        this.tongTienThanhToan = tongTienThanhToan;
    }

    public Integer getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(Integer maKhachHang) {
        this.maKhachHang = maKhachHang;
    }
}
