package ss120_bai_tap_lam_them.Service;

import ss120_bai_tap_lam_them.Model.OTo;

import java.util.ArrayList;
import java.util.Scanner;

public class OToService implements IOToService{
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<OTo> oTos = new ArrayList();
    @Override
    public void add(){
        System.out.print("Nhập biển kiểm soát : ");
        String bienKiemSoat=scanner.nextLine();
        System.out.print("Nhập hãng sản xuất : ");
        String hangSanXuat=scanner.nextLine();
        System.out.print("Nhập năm sản xuất : ");
        Integer namSanXuat=Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập chủ hở hữu : ");
        String chuSoHuu=scanner.nextLine();
        System.out.print("Nhập kiểu xe : ");
        String kieuXe=scanner.nextLine();
        System.out.print("Nhập số chỗ ngồi : ");
        int soChoNgoi= Integer.valueOf(scanner.nextLine());
        OTo oTo = new OTo(bienKiemSoat,hangSanXuat,namSanXuat,chuSoHuu,soChoNgoi,kieuXe);
        oTos.add(oTo);

    }
//
//    @Override
//    public void display() {
//        for(OTo oto : oTos  ){
//            System.out.println(oto);
//        }
//
//    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }
}
