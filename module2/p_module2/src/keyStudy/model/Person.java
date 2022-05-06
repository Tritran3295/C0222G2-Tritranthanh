package keyStudy.model;

public abstract class Person {
    private String hoVaTen;
    private Integer ngaySinh;
    private String gioiTinh;
    private Integer CMND;
    private Integer soDienThoai;
    private String email;
    public Person(){};

    public Person(String hoVaTen, Integer ngaySinh, String gioiTinh, Integer CMND, Integer soDienThoai, String email) {
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.CMND = CMND;
        this.soDienThoai = soDienThoai;
        this.email = email;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public Integer getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Integer ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Integer getCMND() {
        return CMND;
    }

    public void setCMND(Integer CMND) {
        this.CMND = CMND;
    }

    public Integer getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(Integer soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                "Họ và tên : " + hoVaTen + '\'' +
                ", Năm sinh : " + ngaySinh +
                ",Giới Tính : " + gioiTinh +
                ", CMND : " + CMND +
                ", Số điện thoại : " + soDienThoai +
                ", Email : " + email + '\''
                ;
    }
    public String convertLine() {
        String line = this.hoVaTen + "," +
                this.ngaySinh + "," +
                this.gioiTinh + "," +
                this.CMND + "," +
                this.soDienThoai + "," +
                this.email;
        return line;
    }
}
