package keyStudy.model;

public class Room extends Facility{
    private String dichVuFreeDiKem;
    public Room(){};

    public Room(String dichVuFreeDiKem) {
        this.dichVuFreeDiKem = dichVuFreeDiKem;
    }

    public Room(String tenDichVu, String maDichVu, String dienTichSuDung, int chiPhiThue, Integer soLuongNguoiToiDa, String kieuThue, String dichVuFreeDiKem) {
        super(tenDichVu,maDichVu, dienTichSuDung, (double) chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.dichVuFreeDiKem = dichVuFreeDiKem;
    }

    public Room(String tenDichVu, String maDichVu, String dienTichSuDung, Double chiPhiThue, int soNguoiToiDa, String kieuThue, String dichVuDiKem) {
    }

    public String getDichVuFreeDiKem() {
        return dichVuFreeDiKem;
    }

    public void setDichVuFreeDiKem(String dichVuFreeDiKem) {
        this.dichVuFreeDiKem = dichVuFreeDiKem;
    }

    @Override
    public String toString() {
        return
                "Dịch vụ free đi kèm : " + dichVuFreeDiKem + '\''
                ;
    }
}
