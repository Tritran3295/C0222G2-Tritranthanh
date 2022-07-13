package model;

public class MaHoKhau {
    private int stt;
    private String maHoKhau;

    public MaHoKhau() {
    }

    public MaHoKhau(int stt, String maHoKhau) {
        this.stt = stt;
        this.maHoKhau = maHoKhau;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getMaHoKhau() {
        return maHoKhau;
    }

    public void setMaHoKhau(String maHoKhau) {
        this.maHoKhau = maHoKhau;
    }
}
