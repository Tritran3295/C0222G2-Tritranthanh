package ss999_ket_thuc_module.Utils;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Regex {
    static Scanner scanner = new Scanner(System.in);
    public static int getChoice(int choice) {
        boolean check = true;
        while (check) {
            try {
                choice = Integer.parseInt(scanner.nextLine());
                check = false;
            } catch (NumberFormatException e) {
                System.err.println("Error :" + e.getMessage());
                System.out.println("Nhập sai mời nhập lại");
                check = true;
            } catch (Exception e) {
                System.err.println(e.getMessage());
                check = true;
            }
        }
        return choice;
    }
}
