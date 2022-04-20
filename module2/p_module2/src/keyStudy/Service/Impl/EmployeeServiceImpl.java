package keyStudy.Service.Impl;

import keyStudy.Service.IService;
import keyStudy.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IService {
    private static List<Employee> list = new ArrayList<>();
    static {
        Employee employee1=new Employee("Ngô Thảo Vân",1993,"Nữ",197327720,1233,"thanhtritran3295@gmail.com","CH101","Đại Học","Trưởng phòng",10.500);
        Employee employee2=new Employee("Ngô Thị Vân",1995,"Nữ",197327721,1231,"thanhtritran3295@gmail.com","CH102","Trung Cấp","Nhân Sự",11.500);
        Employee employee3=new Employee("Ngô Thảo Mây",1992,"Nữ",197327722,1230,"thanhtritran3295@gmail.com","CH103","Cao Đẳng","Nhân Viên",12.500);
    list.add(employee1);
    list.add(employee2);
    list.add(employee3);
    }

    @Override
    public void add() {

    }

    @Override
    public void display() {
        System.out.println("Danh sách nhân viên : ");
        for (Employee x : list){
            System.out.println(x);
        }
    }

    @Override
    public void edit() {

    }
}
