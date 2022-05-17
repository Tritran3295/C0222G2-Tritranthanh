package ss999_ket_thuc_module.service.Impl;

import ss999_ket_thuc_module.Utils.ReadAndWrite;
import ss999_ket_thuc_module.model.HandPhone;
import ss999_ket_thuc_module.service.IHandPhone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HandPhoneImpl implements IHandPhone {
    Scanner scanner = new Scanner(System.in);
    private static  List<HandPhone> handPhoneList = new ArrayList<>();
    private static final String PATH_HANDPHONE ="src/ss999_ket_thuc_module/data/realPhone.csv";

    static {
        handPhoneList.add(new HandPhone(3, "Nokia N72", 100000, 10, "Nokia", "China", "Repaired"));
        handPhoneList.add(new HandPhone(4, "Iphone 11", 600000, 10, "Nokia", "USA", "Non Repaired"));
        ReadAndWrite.writeHandPhone(PATH_HANDPHONE,handPhoneList);
    }

    @Override
    public void display() {
        System.out.println("List of hand phone : ");
        for (HandPhone handPhone : handPhoneList) {
            System.out.println(handPhone);
        }


    }

    @Override
    public void add() {
        handPhoneList=ReadAndWrite.readHandPhone();
        System.out.println("Enter the id : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name of phone: ");
        String name = scanner.nextLine();
        System.out.println("Enter the price of phone: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the number of phone: ");
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the house product: ");
        String houseProduct = scanner.nextLine();
        System.out.println("Enter the nation hand :");
        String nationHand = scanner.nextLine();
        System.out.println("Enter the behavior: ");
        String behavior = scanner.nextLine();
        HandPhone handPhone = new HandPhone(id, name, price, num, houseProduct, nationHand, behavior);
        handPhoneList.add(handPhone);
        ReadAndWrite.writeHandPhone(PATH_HANDPHONE,handPhoneList);

    }

    @Override
    public void delete() {
        handPhoneList=ReadAndWrite.readHandPhone();
        System.out.println("The list delete: ");
        System.out.println("Enter the id you wanna delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        int choice;
        for (HandPhone handPhone : handPhoneList) {
            if (id == handPhone.getId()) {
                flag = true;
                break;
            }

        }
        if (flag) {
            do {
                System.out.println("Are you sure to delete? ");
                System.out.println("1.Yes \n " + "2.No");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        for (int i = 0; i < handPhoneList.size(); i++) {
                            if (id == handPhoneList.get(i).getId()) {
                                handPhoneList.remove(i);
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
                ReadAndWrite.writeHandPhone(PATH_HANDPHONE,handPhoneList);
            } while (flag);
        } else {
            try {
                throw new Exception("Not find the id: ");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void search() {
        handPhoneList=ReadAndWrite.readHandPhone();
        boolean flag = false;
        System.out.println("Enter the id : ");
        int id = Integer.parseInt(scanner.nextLine());
        for (HandPhone handPhone : handPhoneList) {
            if (handPhone.getId() == id) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("Find: ");
            for (HandPhone handPhone : handPhoneList) {
                if (handPhone.getId() == id) {
                    System.out.println(handPhone);
                }
            }
        } else {
            System.out.println("Not find");
        }


    }
}
