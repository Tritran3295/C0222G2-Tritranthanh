package ss999_ket_thuc_module.service.Impl;

import ss999_ket_thuc_module.Utils.ReadAndWrite;
import ss999_ket_thuc_module.model.RealPhone;
import ss999_ket_thuc_module.service.IRealPhone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RealPhoneImpl implements IRealPhone{
    Scanner scanner = new Scanner(System.in);
    private static  List<RealPhone> realPhoneList = new ArrayList<>();
    private static final String PATH_REALPHONE ="src/ss999_ket_thuc_module/data/handPhone.csv";
    static {
        realPhoneList.add(new RealPhone(1,"SamSung",10500,10,"SamSung",6,"Toàn Quốc"));
        realPhoneList.add(new RealPhone(2,"IphoneX",15500,10,"Iphone",6,"Toàn Quốc"));
        ReadAndWrite.writeRealPhone(PATH_REALPHONE,realPhoneList);
    }

    @Override
    public void display() {
        realPhoneList=ReadAndWrite.readRealPhone();
        System.out.println("List of real phone: ");
        for(RealPhone realPhone:realPhoneList){
            System.out.println(realPhone);
        }
    }

    @Override
    public void add() {
        realPhoneList=ReadAndWrite.readRealPhone();
        System.out.println("Enter the id : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name of phone: ");
        String name = scanner.nextLine();
        System.out.println("Enter the price of phone: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the number of phone: ");
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the house product: ");
        String houseProduct= scanner.nextLine();
        System.out.println("Enter time to protect : ");
        int timeProtect= Integer.parseInt(scanner.nextLine());
        System.out.println("Enter range to protect: ");
        String rangeProtect = scanner.nextLine();
        RealPhone realPhone = new RealPhone(id,name,price,num,houseProduct,timeProtect,rangeProtect);
        realPhoneList.add(realPhone);
        ReadAndWrite.writeRealPhone(PATH_REALPHONE,realPhoneList);


    }

    @Override
    public void delete() {
        realPhoneList=ReadAndWrite.readRealPhone();
        System.out.println("The list delete: ");
        System.out.println("Enter the id you wanna delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        int choice;
        for (RealPhone realPhone : realPhoneList) {
            if (id == realPhone.getId()) {
                flag = true;
                break;
            }

        }
        if(flag) {
            do {
                System.out.println("Are you sure to delete? ");
                System.out.println("1.Yes \n " + "2.No");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        for (int i = 0; i < realPhoneList.size(); i++) {
                            if (id == realPhoneList.get(i).getId()) {
                                realPhoneList.remove(i);
                                break;
                            }

                        }
                        System.out.println("Had delete ");
                        flag = false;
                        break;
                    case 2:
                        System.out.println("Not delete");
                        flag = false;
                        break;
                    default:
                        System.out.println("please choice again:");
                        break;
                }
            } while (flag);
        }else {
            try{
                throw new Exception("Not find the id: ");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void search() {
        realPhoneList=ReadAndWrite.readRealPhone();
        boolean flag = false;
        System.out.println("Enter the id : ");
        int id = Integer.parseInt(scanner.nextLine());
        for (RealPhone realPhone : realPhoneList) {
            if (realPhone.getId() == id) {
                flag = true;
            }
        }
        if(flag){
            System.out.println("Find: ");
            for (RealPhone realPhone : realPhoneList) {
                if (realPhone.getId() == id) {
                    System.out.println(realPhone);
                }
            }
        }else {
            System.out.println("Not find");
        }

    }
}
