package keyStudy.Controller;

import keyStudy.Service.Impl.CustomerServiceImpl;
import keyStudy.Service.Impl.EmployeeServiceImpl;
import keyStudy.Service.Impl.FacilityServiceImpl;
import keyStudy.Utils.Regex.Regex;

import java.util.Scanner;

public class DisplayMainMenu {
    Scanner scanner = new Scanner(System.in);
    EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    CustomerServiceImpl customerService = new CustomerServiceImpl();
    FacilityServiceImpl facilityService = new FacilityServiceImpl();
    public void display() {
        while (true) {
            System.out.println("Enter the contend you wanna choose :");
            System.out.println("..........MeNu..........\n" +
                    "1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n");

            int choiceMain = 0;
            choiceMain= Regex.getChoice(choiceMain);
            switch (choiceMain) {
                case 1:
                    menuEmployee();
                    break;
                case 2:
                    menuCustomer();
                    break;
                case 3:
                    menuFacility();
                    break;
                case 4:
                    menuBooking();
                    break;
                case 5:
                    menuPromotion();
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }

    public void menuEmployee() {
        while (true) {
            System.out.println("1\tDisplay list employees\n" +
                    "2\tAdd new employee\n" +
                    "3\tEdit employee\n" +
                    "4\tReturn main menu\n");
            int choiceEmployee = 0;
            choiceEmployee=Regex.getChoice(choiceEmployee);
            switch (choiceEmployee) {
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.add();
                    break;
                case 3:
                    employeeService.edit();
                    break;
                case 4:
                    return;
            }
        }
    }

    private void menuCustomer() {
        while (true) {
            System.out.println("1.\tDisplay list customers\n" +
                    "2.\tAdd new customer\n" +
                    "3.\tEdit customer\n" +
                    "4.\tReturn main menu\n");
            int choiceCustomer = 0;
            choiceCustomer=Regex.getChoice(choiceCustomer);
            switch (choiceCustomer) {
                case 1:
                    customerService.display();
                    break;
                case 2:
                    customerService.add();
                    break;
                case 3:
                    customerService.edit();
                    break;
                case 4:
                    return;

            }
        }
    }

    private void menuFacility() {
        while (true) {
            System.out.println("1\tDisplay list facility\n" +
                    "2\tAdd new facility\n" +
                    "3\tDisplay list facility maintenance\n" +
                    "4\tReturn main menu\n");
            int choiceFaci = 0;
            choiceFaci=Regex.getChoice(choiceFaci);
            switch (choiceFaci) {
                case 1:
                    facilityService.display();
                    break;
                case 2:
                    addNewService();
                    break;
                case 3:
                    facilityService.displayMaintenance();
                    break;
                case 4:
                    return;

            }
        }
    }

    private void addNewService() {
        while (true) {
            System.out.println("1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu");
            int choiceSever = 0;
            choiceSever=Regex.getChoice(choiceSever);
            switch (choiceSever) {
                case 1:
                    facilityService.addNewVilla();
                    break;
                case 2:
                    facilityService.addNewHouse();
                    break;
                case 3:
                    facilityService.addNewRoom();
                    break;
                case 4:
                    menuFacility();
            }
        }
    }

    private void menuPromotion() {
        System.out.println("1.\tDisplay list customers use service\n" +
                "2.\tDisplay list customers get voucher\n" +
                "3.\tReturn main menu\n");
    }

    private void menuBooking() {
        System.out.println("1.\tAdd new booking\n" +
                "2.\tDisplay list booking\n" +
                "3.\tCreate new contracts\n" +
                "4.\tDisplay list contracts\n" +
                "5.\tEdit contracts\n" +
                "6.\tReturn main menu\n");
    }


}



