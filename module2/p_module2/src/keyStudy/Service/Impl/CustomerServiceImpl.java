package keyStudy.Service.Impl;

import keyStudy.Service.ICustomerService;
import keyStudy.Utils.File.ReadAndWriteBuffer;
import keyStudy.model.Customer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    private static List<Customer> list= new LinkedList<>();
    private static final String PATH_CUSTOMER ="src/keyStudy/data/customer.csv";
    static {
        list.add(new Customer("Trần Thanh Trí",1993,"Nam",1893402,34596,"tranthanhtri@sad112","Ch104","Vip","5*"));
        list.add(new Customer("Trí Thanh Trần",1994,"Nam",1893403,34597,"tranthanhtri@sad1123","Ch105","Normal","3*"));
        list.add(new Customer("Thanh Thanh Trí",1995,"Nam",1893404,34598,"tranthanhtri@sad13213","Ch106","Stadium","2*"));
        ReadAndWriteBuffer.writeCustomer(PATH_CUSTOMER,list);


    }


    public void display() {
        System.out.println("Danh sách khách hàng : ");
        for (Customer x:list) {
            System.out.println(x);
        }
    }
    public void add(){
        list=ReadAndWriteBuffer.readCustomer();
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
        System.out.println("Nhập mã khách hàng : ");
        String maKhachHang = scanner.nextLine();
        System.out.println("Nhập loại khách : ");
        String loaiKhach = scanner.nextLine();
        System.out.println("Nhập địa chỉ : ");
        String diaChi = scanner.nextLine();
        Customer customer = new Customer(hoVaTen,ngaySinh,gioiTinh,soCMND,soDienThoai,email,maKhachHang,loaiKhach,diaChi);
        list.add(customer);
        ReadAndWriteBuffer.writeCustomer(PATH_CUSTOMER,list);


    }
    public void edit(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã khách hàng muốn sửa : ");
        String maKhachhang = scanner.nextLine();
        for(Customer customer:list){
            if(maKhachhang.equals(customer.getMaKhachHang())){
                System.out.println("Nhập họ và tên khách hàng mới : ");
                customer.setHoVaTen(scanner.nextLine());
                System.out.println("Nhập ngày sinh mới : ");
                customer.setNgaySinh(Integer.parseInt(scanner.nextLine()));
                System.out.println("Thỉnh giới tính mới :");
                customer.setGioiTinh( scanner.nextLine());
                System.out.println("Nhập số CMND mới : ");
                customer.setCMND(Integer.parseInt(scanner.nextLine()));
                System.out.println("Thỉnh nhập sđt mới : ");
                customer.setSoDienThoai(Integer.parseInt(scanner.nextLine()));
                System.out.println("Nhập email mới : ");
                customer.setEmail(scanner.nextLine());
                System.out.println("Nhập mã khách hàng mới : ");
                customer.setMaKhachHang(scanner.nextLine());
                System.out.println("Nhập loại khách mới : ");
                customer.setLoaiKhach(scanner.nextLine());
                System.out.println("Nhập địa chỉ mới : ");
                customer.setDiaChi(scanner.nextLine());
            }else {
                System.out.println("không tìm thấy mã khách hàng phù hợp");
            }
        }

    }
}
