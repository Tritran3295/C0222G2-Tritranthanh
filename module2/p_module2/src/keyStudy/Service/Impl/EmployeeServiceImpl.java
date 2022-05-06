package keyStudy.Service.Impl;

import keyStudy.Service.IService;
import keyStudy.Utils.File.ReadAndWriteBuffer;
import keyStudy.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IService {
    private static List<Employee> list = new ArrayList<>();
    private static final String PATH_EMPLOYEE ="src/keyStudy/data/employee.csv";

    static {
        Employee employee1 = new Employee("Ngô Thảo Vân", 1993, "Nữ", 197327720, 1233, "thanhtritran3295@gmail.com", "CH101", "Đại Học", "Trưởng phòng", 10.500);
        Employee employee2 = new Employee("Ngô Thị Vân", 1995, "Nữ", 197327721, 1231, "thanhtritran3295@gmail.com", "CH102", "Trung Cấp", "Nhân Sự", 11.500);
        Employee employee3 = new Employee("Ngô Thảo Mây", 1992, "Nữ", 197327722, 1230, "thanhtritran3295@gmail.com", "CH103", "Cao Đẳng", "Nhân Viên", 12.500);
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        ReadAndWriteBuffer.writeEmployee(PATH_EMPLOYEE,list);
    }

    @Override
    public void add() {
        list=ReadAndWriteBuffer.readEmployee();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Thỉnh nhập họ và tên");
        String hoVaTen = scanner.nextLine();
        System.out.println("Thỉnh ngày sinh");
        int ngaySinh = Integer.parseInt(scanner.nextLine());
        System.out.println("Thỉnh giới tính :");
        String gioiTinh = scanner.nextLine();
        System.out.println("Nhập số CMND : ");
        int soCMND = Integer.parseInt(scanner.nextLine());
        System.out.println("Thỉnh nhập SĐt : ");
        int soDienThoai = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập email");
        String email = scanner.nextLine();
        System.out.println("Nhập mã nhân viên : ");
        String maNhanVien = scanner.nextLine();
        System.out.println("Nhập trình độ");
        String trinhDo = scanner.nextLine();
        System.out.println("nhập vị trí : ");
        String viTri = scanner.nextLine();
        System.out.println("nhập lương : ");
        Double luong = Double.parseDouble(scanner.nextLine());
        Employee employee = new Employee(hoVaTen, ngaySinh, gioiTinh, soCMND, soDienThoai, email, maNhanVien, trinhDo, viTri, luong);
        list.add(employee);
        ReadAndWriteBuffer.writeEmployee(PATH_EMPLOYEE,list);

    }

    @Override
    public void display() {
        list=ReadAndWriteBuffer.readEmployee();
        System.out.println("Danh sách nhân viên : ");
        for (Employee x : list) {
            System.out.println(x);
        }
    }

    @Override
    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã nhân viên bạn muốn sửa : ");
        String maNhanVien = scanner.nextLine();
        for (Employee employee : list) {
            if (maNhanVien.equals(employee.getMaNhanVien()) ) {
                System.out.println("Thỉnh nhập họ và tên mới : ");
                employee.setHoVaTen(scanner.nextLine());
                System.out.println("Thỉnh ngày sinh mới : ");
                employee.setNgaySinh(Integer.parseInt(scanner.nextLine()));
                System.out.println("Thỉnh giới tính mới :");
                employee.setGioiTinh(scanner.nextLine());
                System.out.println("Nhập số CMND mới : ");
                employee.setCMND(Integer.parseInt(scanner.nextLine()));
                System.out.println("Thỉnh nhập SĐt mới : ");
                employee.setSoDienThoai(Integer.parseInt(scanner.nextLine()));
                System.out.println("Nhập email mới : ");
                employee.setEmail(scanner.nextLine());
                System.out.println("Nhập mã nhân viên mới : ");
                employee.setMaNhanVien(scanner.nextLine());
                System.out.println("Nhập trình độ mới ");
                employee.setTrinhDo(scanner.nextLine());
                System.out.println("nhập vị trí mới : ");
                employee.setViTri(scanner.nextLine());
                System.out.println("nhập lương mới : ");
                employee.setLuong(scanner.nextDouble());
                break;


            }

            else {
                System.out.println("Không tìm thấy mã nhân viên muốn sửa : ");
            }
        }

    }
}
