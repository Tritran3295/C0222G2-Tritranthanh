package keyStudy.Service.Impl;

import javafx.concurrent.Service;
import keyStudy.Service.IFacilityService;
import keyStudy.Service.IService;
import keyStudy.model.Facility;
import keyStudy.model.House;
import keyStudy.model.Room;
import keyStudy.model.Villa;

import java.util.*;

public class FacilityServiceImpl implements IFacilityService {
    Scanner scanner = new Scanner(System.in);
    private static LinkedHashMap<Facility, Integer> facilityLinkedHashMap = new LinkedHashMap<>();
    private static List<Facility> maintenanceFacilityList = new ArrayList<>();

    public static final String REGEX_VILLA = "^^(SVVL)\\-[0-9]{4}$";
    public static final String REGEX_HOUSE = "^^(SVHO)\\-[0-9]{4}$";
    public static final String REGEX_RO = "^^(SVRO)\\-[0-9]{4}$";
    public static final String REGEX_TENDICHVU = "^[A-Z][a-z0-9]{1,9}$";
    public static final String REGEX_AREAUSE = "^[3-9$";


    static {
//        facilityLinkedHashMap.put(new Villa("Villa", "200m2", 20.500, 10, "Ngắn hạn", "5*", "10m2", 4), 0);
//        facilityLinkedHashMap.put(new Villa("Villa", "250m2", 23.500, 12, "Ngắn hạn", "5*", "10m2", 5), 0);
//        facilityLinkedHashMap.put(new House("House", "70m2", 12.500, 4, "Ngắn hạn", "3*", 1), 0);
//        facilityLinkedHashMap.put(new House("House", "85m2", 13.500, 5, "Ngắn hạn", "3.5*", 1), 0);
//        facilityLinkedHashMap.put(new Room("Room", "50m2", 7.500, 2, "Theo giờ", "Free buffer"), 0);
//        facilityLinkedHashMap.put(new Room("Room", "60m2", 8.500, 3, "Theo giờ", "Free buffer"), 0);
        facilityLinkedHashMap.put(new Villa("Villa", "200m2", 20.500, 10, "Ngắn hạn", "5*", "10m2", 4), 0);
        facilityLinkedHashMap.put(new Villa("Villa", "200m2", 20.500, 10, "Ngắn hạn", "5*", "10m2", 4), 0);
        facilityLinkedHashMap.put(new Villa("Villa", "200m2", 20.500, 10, "Ngắn hạn", "5*", "10m2", 4), 0);
        facilityLinkedHashMap.put(new Villa("Villa", "200m2", 20.500, 10, "Ngắn hạn", "5*", "10m2", 4), 0);


    }
    @Override
    public void display() {
        System.out.println("Danh sách các dịch vụ: ");
        for(Map.Entry<Facility,Integer> entrys : facilityLinkedHashMap.entrySet()) {
            System.out.println("dịch vụ : " + entrys.getKey().getTenDichVu());
            System.out.println("số lần đã thuê : " +entrys.getValue());
        }

    }

    @Override
    public void add(Facility facility) {

        if (facilityLinkedHashMap.isEmpty()) {
            facilityLinkedHashMap.put(facility, 1);
        } else {
            Set<Facility> facilityKeySet = facilityLinkedHashMap.keySet();
            int countBooking = 0;

            for (Facility key : facilityKeySet) {
                if (facility.getTenDichVu().equals(key.getTenDichVu())) {
                    countBooking++;
                }
            }

            if (countBooking < 5) {
                facilityLinkedHashMap.put(facility, countBooking + 1);
            } else {
                System.err.println("Dịch vụ đang bão trì!");
                maintenanceFacilityList.add(facility);
            }
        }
    }

    @Override
    public void addNewHouse() {
        System.out.println("Nhập tên dịch vụ : ");
        String tenDichVu= scanner.nextLine();

        System.out.println("Nhập diện tích sử dụng : ");
        String dienTichSuDung=scanner.nextLine();
        System.out.println("Nhập chi phí thuê : ");
        Double chiPhiThue=Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số lượng người tối đa : ");
        int soNguoiToiDa=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu thuê : ");
        String kieuThue=scanner.nextLine();
        System.out.println("Nhập tiêu chuẩn phòng : ");
        String tieuChuanPhong=scanner.nextLine();
        System.out.println("Nhập số tầng: ");
        int soTang= Integer.parseInt(scanner.nextLine());
        House house = new House(tenDichVu,dienTichSuDung,chiPhiThue,soNguoiToiDa,kieuThue,tieuChuanPhong, soTang);
        this.add(house);
    }

    @Override
    public void addNewVilla(){

        System.out.println("Nhập tên dịch vụ : ");
        String tenDichVu= scanner.nextLine();
        System.out.println("Nhập diện tích sử dụng : ");
        String dienTichSuDung=scanner.nextLine();
        System.out.println("Nhập chi phí thuê : ");
        Double chiPhiThue=Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số lượng người tối đa : ");
        int soNguoiToiDa=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu thuê : ");
        String kieuThue=scanner.nextLine();
        System.out.println("Nhập tiêu chuẩn phòng : ");
        String tieuChuanPhong=scanner.nextLine();
        System.out.println("Nhập diện tích hồ bơi : ");
        String dientichHoBoi=scanner.nextLine();
        System.out.println("Nhập số tầng : ");
        int soTang = Integer.parseInt(scanner.nextLine());
        Villa villa= new Villa(tenDichVu,dienTichSuDung,chiPhiThue,soNguoiToiDa,kieuThue,tieuChuanPhong,dientichHoBoi,soTang);
        this.add(villa);
    }

    @Override
    public void addNewRoom() {

        System.out.println("Nhập tên dịch vụ : ");
        String tenDichVu= scanner.nextLine();
        System.out.println("Nhập diện tích sử dụng : ");
        String dienTichSuDung=scanner.nextLine();
        System.out.println("Nhập chi phí thuê : ");
        Double chiPhiThue=Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số lượng người tối đa : ");
        int soNguoiToiDa=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu thuê : ");
        String kieuThue=scanner.nextLine();
        System.out.println("Nhập dịch vụ đi kèm : ");
        String dichVuDiKem=scanner.nextLine();
        Room room = new Room(tenDichVu,dienTichSuDung,chiPhiThue,soNguoiToiDa,kieuThue,dichVuDiKem);
        this.add(room);
    }

    @Override
    public void displayMaintenance() {
        if (!maintenanceFacilityList.isEmpty()) {
            for (Facility facility : maintenanceFacilityList) {
                System.out.println(facility);
            }
        } else {
            System.err.println("Không có dịch vụ đang bão trì!");
        }
    }

}
