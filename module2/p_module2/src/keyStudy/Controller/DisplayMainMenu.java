package keyStudy.Controller;

import keyStudy.Service.Impl.CustomerServiceImpl;
import keyStudy.Service.Impl.EmployeeServiceImpl;

import java.util.Scanner;

public class DisplayMainMenu {
    Scanner scanner = new Scanner(System.in);
    EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    CustomerServiceImpl customerService = new CustomerServiceImpl();
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
                    menuCustomer();
                    break;

            }
        }
    }

    private void menuCustomer() {
        System.out.println("1.\tDisplay list customers\n" +
                "2.\tAdd new customer\n" +
                "3.\tEdit customer\n" +
                "4.\tReturn main menu\n");
        choice =Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                customerService.display();
                break;
            case 2:
                customerService.add();
                break;
            case 3:
                customerService.edit();
                break;


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
                employeeService.display();
                break;
            case 2:
                employeeService.add();
                break;
            case 3:
                employeeService.edit();
                break;


        }
    }

}



