package SmallJob.service.Impl;

import SmallJob.Utils.Exceptionse;
import SmallJob.Utils.ReadAndWrite;
import SmallJob.Utils.Regex;
import SmallJob.model.Oto;
import SmallJob.service.IOto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OtoImpl implements IOto {
    Scanner scanner = new Scanner(System.in);
    private static List<Oto> otoList = new ArrayList<>();
    private static final String PATH_OTO = "src/SmallJob/data/Oto.csv";

    static {
        otoList.add(new Oto("BKS 101", "Toyota", 909, "Nguyễn Văn A", 7, "Xe bán tải"));
        ReadAndWrite.writeToOto(PATH_OTO, otoList);
    }

    @Override
    public void add() {
        otoList = ReadAndWrite.readOto();
        System.out.println("Nhập BKS");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Nhập Hãng SX :");
        String hangSanXuat = scanner.nextLine();
        System.out.println("Nhập năm sx :");

        Integer namSanXuat = 0;
        namSanXuat = Regex.getChoice(namSanXuat);
        System.out.println("nhập chủ sở hữu:");
        String chuSoHuu = scanner.nextLine();
        System.out.println("số chỗ ngồi: ");
        Integer soChoNgoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu xe: ");
        String kieuXe = scanner.nextLine();
        Oto oto = new Oto(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, soChoNgoi, kieuXe);
        otoList.add(oto);
        ReadAndWrite.writeToOto(PATH_OTO, otoList);

    }

    @Override
    public void display() {

        System.out.println("Danh Sách xe Ô tô: ");
        for (Oto oto : otoList) {
            System.out.println(oto);

        }

    }

    @Override
    public void delete() {
        otoList = ReadAndWrite.readOto();
        System.out.println("Danh sách xoá : ");
        System.out.println("Nhập Biển kiếm soát muốn xoá: ");
        String bienKiemSoat = scanner.nextLine();
        boolean flag = false;
        int choice;
        for (int i = 0; i < otoList.size(); i++) {
            if (bienKiemSoat.equalsIgnoreCase(otoList.get(i).getBienKiemSoat())) {
                flag = true;
                break;
            }
        }
        if (flag) {
            do {
                System.out.println("Bạn có muốn xoá :" + bienKiemSoat + "?");
                System.out.println("1.Yes \n" + "2.No");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        for (int i = 0; i < otoList.size(); i++) {
                            if (bienKiemSoat.equalsIgnoreCase(otoList.get(i).getBienKiemSoat())) {
                                otoList.remove(i);
                                break;
                            }
                        }
                        System.out.println("đã xoá");
                        flag = false;
                        break;
                    case 2:
                        System.out.println("chưa xoá");
                        flag = false;
                        break;
                    default:
                        System.out.println("chọn lại");
                        break;


                }
            } while (flag);
            ReadAndWrite.writeToOto(PATH_OTO, otoList);
        } else {
            try {
                throw new Exceptionse("k tìm thấy id");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }


    @Override
    public void search() {
        boolean flag = false;
        System.out.println("Nhập bks: ");
        String bienKiemSoat = scanner.nextLine();
        for (int i = 0; i < otoList.size(); i++) {
            if (otoList.get(i).getBienKiemSoat().contains(bienKiemSoat)) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("find :");
            for (int i = 0; i < otoList.size(); i++) {
                if (otoList.get(i).getBienKiemSoat().contains(bienKiemSoat)) {
                    System.out.println(otoList.get(i));
                }
            }
        } else {
            System.out.println(bienKiemSoat + "Không tìm thấy");
        }


    }
}
