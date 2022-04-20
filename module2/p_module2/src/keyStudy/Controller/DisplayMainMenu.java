package keyStudy.Controller;

import keyStudy.Service.Impl.EmployeeServiceImpl;

import java.util.Scanner;

public class DisplayMainMenu {
    Scanner scanner = new Scanner(System.in);
    EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
int choice;
    public void display() {
        while(true){
            System.out.println("Enter the contend you wanna choose :");
            System.out.println("..........MeNu..........\n" +
                    "1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    menuEmployee();
                    break;
                case 2:

            }
        }
    }
    public void menuEmployee(){
        System.out.println("1\tDisplay list employees\n" +
                "2\tAdd new employee\n" +
                "3\tEdit employee\n" +
                "4\tReturn main menu\n");
        choice =Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
//                add();
                break;
        }
    }
}



