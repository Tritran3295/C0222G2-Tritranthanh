package keyStudy.Service.Impl;

import keyStudy.Service.IFacilityService;
import keyStudy.Utils.File.ReadAndWriteBuffer;
import keyStudy.Utils.Regex.Regex;
import keyStudy.model.Facility;
import keyStudy.model.House;
import keyStudy.model.Room;
import keyStudy.model.Villa;

import java.util.*;

public class FacilityServiceImpl implements IFacilityService {
    Scanner scanner = new Scanner(System.in);
    private static final LinkedHashMap<Facility, Integer> facilityLinkedHashMap = new LinkedHashMap<>();
    private static final List<Facility> maintenanceFacilityList = new ArrayList<>();
    private static List<Villa> villas = new ArrayList<>();
    private static List<House> houses = new ArrayList<>();
    private static List<Room> rooms = new ArrayList<>();
    private static final String PATH_VILLA = "src/keyStudy/data/vlvl.csv";
    private static final String PATH_ROOM = "src/keyStudy/data/room.csv";
    private static final String PATH_HOUSE = "src/keyStudy/data/house.csv";

    static {

        facilityLinkedHashMap.put(new Villa("Villa", "VL100", "200m2", 20.500, 10, "Ngắn hạn", "5*", "10m2", 4), 0);
        facilityLinkedHashMap.put(new Villa("Villa","VL101", "200m2", 20.500, 10, "Ngắn hạn", "5*", "10m2", 4), 0);
        facilityLinkedHashMap.put(new Villa("Villa","VL102", "200m2", 20.500, 10, "Ngắn hạn", "5*", "10m2", 4), 0);
        facilityLinkedHashMap.put(new Villa("Villa","VL103", "200m2", 20.500, 10, "Ngắn hạn", "5*", "10m2", 4), 0);

        villas.add(new Villa("Villa", "VL100", "200m2", 20.500, 10, "Ngắn hạn", "5*", "10m2", 4));
        ReadAndWriteBuffer.writeVilla(PATH_VILLA, villas);
        ReadAndWriteBuffer.writeRoom(PATH_ROOM, rooms);
        ReadAndWriteBuffer.writeHouse(PATH_HOUSE, houses);

    }


    @Override
    public void display() {
        System.out.println("Danh sách các dịch vụ: ");
        for (Map.Entry<Facility, Integer> entrys : facilityLinkedHashMap.entrySet()) {
            System.out.println("dịch vụ : " + entrys.getKey().getTenDichVu());
            System.out.println("số lần đã thuê : " + entrys.getValue());
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
                System.err.println("Dịch vụ đang bảo trì!");
                maintenanceFacilityList.add(facility);
            }
        }
    }

    @Override
    public void displayMaintenance() {
        if (!maintenanceFacilityList.isEmpty()) {
            for (Facility facility : maintenanceFacilityList) {
                System.out.println(facility);
            }
        } else {
            System.err.println("Không có dịch vụ đang bảo trì!");
        }
    }

    @Override
    public void addNewHouse() {
        houses = ReadAndWriteBuffer.readHouse();
        System.out.println("Nhập tên dịch vụ : ");
        String tenDichVu = scanner.nextLine();
        while (!Regex.isHouseNameService(tenDichVu)) {
            System.out.println("Tên dịch vụ không đúng");
            tenDichVu = scanner.nextLine();
        }
        System.out.println("Nhập mã dịch vụ: ");
        String maDichVu = scanner.nextLine();
        while (!Regex.isHouseFacility(maDichVu)) {
            System.out.println("Mã dịch vụ không đúng!");
            maDichVu = scanner.nextLine();
        }
        System.out.println("Nhập diện tích sử dụng : ");
        String dienTichSuDung = scanner.nextLine();
        while (!Regex.isAreaService(dienTichSuDung)) {
            System.out.println("Nhập diện tích sử dụng chưa đúng!");
            dienTichSuDung = scanner.nextLine();
        }
        System.out.println("Nhập chi phí thuê : ");
        double chiPhiThue = Double.parseDouble(scanner.nextLine());
        while (!Regex.isCostService(Double.toString(chiPhiThue))) {
            System.out.println("Chi phí thuê nhập chưa đúng!");
            chiPhiThue = Double.parseDouble(scanner.nextLine());

        }
        System.out.println("Enter the max people : ");
        int soNguoiToiDa = Integer.parseInt(scanner.nextLine());
        while (!Regex.isPeopleService(String.valueOf(soNguoiToiDa))) {
            System.out.println("Enter the max people incorrect");
            soNguoiToiDa = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Nhập kiểu thuê : ");
        String kieuThue = scanner.nextLine();
        while (!Regex.isRentService(kieuThue)) {
            System.out.println("Nhập kiểu thuê chưa đúng!");
            kieuThue = scanner.nextLine();
        }
        System.out.println("Nhập tiêu chuẩn phòng : ");
        String tieuChuanPhong = scanner.nextLine();
        System.out.println("Nhập số tầng: ");
        int soTang = Integer.parseInt(scanner.nextLine());
        while (!Regex.isFloorService(String.valueOf(soTang))) {
            System.out.println("Số tầng chưa đúng!");
            soTang = Integer.parseInt(scanner.nextLine());
        }
        House house = new House(tenDichVu, maDichVu, dienTichSuDung, chiPhiThue, soNguoiToiDa, kieuThue, tieuChuanPhong, soTang);
        this.add(house);
        ReadAndWriteBuffer.writeHouse(PATH_HOUSE, houses);
    }

    @Override
    public void addNewVilla() {
        villas = ReadAndWriteBuffer.readVilla();

        System.out.println("Nhập tên dịch vụ : ");
        String tenDichVu = scanner.nextLine();
        while (!Regex.isVillaNameService(tenDichVu)) {
            System.out.println("Tên dịch vụ không đúng");
            tenDichVu = scanner.nextLine();
        }
        System.out.println("Nhập mã dịch vụ: ");
        String maDichVu = scanner.nextLine();
        while (!Regex.isVillaFacility(maDichVu)) {
            System.out.println("Mã dịch vụ không đúng !");
            maDichVu = scanner.nextLine();
        }
        System.out.println("Nhập diện tích sử dụng : ");
        String dienTichSuDung = scanner.nextLine();
        while (!Regex.isAreaService(dienTichSuDung)) {
            System.out.println("Nhập diện tích sử dụng chưa đúng!");
            dienTichSuDung = scanner.nextLine();
        }
        System.out.println("Nhập chi phí thuê : ");
        Double chiPhiThue = Double.parseDouble(scanner.nextLine());
        while (!Regex.isCostService(String.valueOf(chiPhiThue))) {
            System.out.println("Chi phí thuê nhập chưa đúng!");
            chiPhiThue = Double.parseDouble(scanner.nextLine());
        }
        System.out.println("Nhập số lượng người tối đa : ");
        int soNguoiToiDa = Integer.parseInt(scanner.nextLine());
        while (!Regex.isPeopleService(String.valueOf(soNguoiToiDa))) {
            System.out.println("Nhập số lượng người tối đa chưa đúng");
            soNguoiToiDa = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Nhập kiểu thuê : ");
        String kieuThue = scanner.nextLine();
        while (!Regex.isRentService(kieuThue)) {
            System.out.println("Nhập kiểu thuê chưa đúng!");
            kieuThue = scanner.nextLine();
        }
        System.out.println("Nhập tiêu chuẩn phòng : ");
        String tieuChuanPhong = scanner.nextLine();
        System.out.println("Nhập diện tích hồ bơi : ");
        String dientichHoBoi = scanner.nextLine();
        while (!Regex.isAreaService(dienTichSuDung)) {
            System.out.println("Nhập diện tích sử dụng chưa đúng!");
            dienTichSuDung = scanner.nextLine();
        }
        System.out.println("Nhập số tầng : ");
        int soTang = Integer.parseInt(scanner.nextLine());
        while (!Regex.isFloorService(String.valueOf(soTang))) {
            System.out.println("Số tầng chưa đúng!");
            soTang = Integer.parseInt(scanner.nextLine());
        }
        Villa villa = new Villa(tenDichVu, maDichVu, dienTichSuDung, chiPhiThue, soNguoiToiDa, kieuThue, tieuChuanPhong, dientichHoBoi, soTang);
        villas.add(villa);
        this.add(villa);
        ReadAndWriteBuffer.writeVilla(PATH_VILLA, villas);
    }

    @Override
    public void addNewRoom() {
        rooms = ReadAndWriteBuffer.readRoom();
        System.out.println("Nhập tên dịch vụ : ");
        String tenDichVu = scanner.nextLine();
        while (!Regex.isRoomNameService(tenDichVu)) {
            System.out.println("Tên dịch vụ không đúng");
            tenDichVu = scanner.nextLine();
        }
        System.out.println("Nhập mã dịch vụ: ");
        String maDichVu = scanner.nextLine();
        while (!Regex.isRoomFacility(maDichVu)) {
            System.out.println("Mã dịch vụ không đúng!");
            maDichVu = scanner.nextLine();
        }
        System.out.println("Nhập diện tích sử dụng : ");
        String dienTichSuDung = scanner.nextLine();
        while (!Regex.isAreaService(dienTichSuDung)) {
            System.out.println("Nhập diện tích sử dụng chưa đúng!");
            dienTichSuDung = scanner.nextLine();
        }
        System.out.println("Nhập chi phí thuê : ");
        double chiPhiThue = Double.parseDouble(scanner.nextLine());
        while (!Regex.isCostService(Double.toString(chiPhiThue))) {
            System.out.println("Chi phí thuê nhập chưa đúng !");
            chiPhiThue = Double.parseDouble(scanner.nextLine());
        }
        System.out.println("Nhập số lượng người tối đa : ");
        int soNguoiToiDa = Integer.parseInt(scanner.nextLine());
        while (!Regex.isPeopleService(String.valueOf(soNguoiToiDa))) {
            System.out.println("Nhập số lượng người tối đa chưa đúng");
            soNguoiToiDa = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Nhập kiểu thuê : ");
        String kieuThue = scanner.nextLine();
        while (!Regex.isRentService(kieuThue)) {
            System.out.println("Nhập kiểu thuê chưa đúng!");
            kieuThue = scanner.nextLine();
        }
        System.out.println("Nhập dịch vụ đi kèm : ");
        String dichVuDiKem = scanner.nextLine();
        Room room = new Room(tenDichVu, maDichVu, dienTichSuDung, chiPhiThue, soNguoiToiDa, kieuThue, dichVuDiKem);
        this.add(room);
        ReadAndWriteBuffer.writeRoom(PATH_ROOM, rooms);
    }


}
