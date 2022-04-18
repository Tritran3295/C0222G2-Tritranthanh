package ss120_bai_tap_lam_them.Controller;

import ss120_bai_tap_lam_them.Service.IOToService;
import ss120_bai_tap_lam_them.Service.IXeTaiService;
import ss120_bai_tap_lam_them.Service.OToService;
//import ss120_bai_tap_lam_them.Service.XeTaiService;

import java.util.Scanner;

public class PhuongTienController {
    private static Scanner scanner = new Scanner(System.in);
//    private  static IXeTaiService iXeTaiService =  new XeTaiService();
    private static IOToService ioToService = new OToService();
    public void display(){
        while (true){
            System.out.println("App quản lý phương tiện");
            System.out.println("Chọn chức năng: ");
            System.out.println("1. Thêm mới phương tiện.\n" +
                    "2. Hiện thị phương tiện\n" +
                    "3. Xóa phương tiện\n" +
                    "4. Tìm kiếm theo biển kiểm soát\n" +
                    "5. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    chonLoaiXe();
                    break;
                case 2:
                    hienThiPhuongTien();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }

    private void hienThiPhuongTien() {
        System.out.println("1. Thêm xe tải,\n" +
                "2. Thêm ôtô,\n" +
                "3. Thêm xe máy.");
        System.out.println("Mời chọn xe: ");
        int loaiXe = Integer.parseInt(scanner.nextLine());
        switch (loaiXe){
            case 1:
//                IOToService.display();
        }
    }

    private void chonLoaiXe() {
    }
}
