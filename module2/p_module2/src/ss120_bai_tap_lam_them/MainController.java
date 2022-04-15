package ss120_bai_tap_lam_them;

import java.util.Scanner;

public class MainController {
    public static void displayMainMenu(){
        Scanner scanner= new Scanner(System.in);
        boolean flag= true;
        do{
            System.out.println("Main menu \n"+
                    "1.Display \n"+
                    "2.Add \n"+
                    "3.Delete \n"+
                    "4.Search \n"+
                    "5.Exit");
            System.out.println("Select function : ");
            int chooseMenu = Integer.parseInt(scanner.nextLine());
            switch (chooseMenu){
                case 1:
                    System.out.println("Traffic list");
                    break;
                case 2:
                    System.out.println("Add new traffic");
                    break;
                case 3:
                    System.out.println("Delete a traffic");
                    break;
                case 4:
                    System.out.println("Search a traffic in the list");
                    break;
                case 5:
                    System.out.println("Exit");
                    flag=false;
                    break;
            }
        }while (flag);

    }
}
