package keyStudy.Utils.Regex;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
    static Scanner scanner = new Scanner(System.in);
    public static final String REGEX_VILLA = "^(SVVL)\\-[0-9]{4}$";
    public static final String REGEX_HOUSE = "^(SVHO)\\-[0-9]{4}$";
    public static final String REGEX_RO = "^(SVRO)\\-[0-9]{4}$";
    public static final String REGEX_TENDICHVU = "^[A-Z][a-z0-9]{1,9}$";
    public static final String REGEX_AREAUSE = "^((([3-9][0-9])|([1-9][0-9][0-9]+))\\.[0-9]{1,})$";
    public static final String REGEX_COST = "^[0-9]+\\.[0-9]+$";

    public static final String REGEX_MAXPEOPLE = "^[1-9]$|^[1][1-9]{1}$";
    public static final String REGEX_FLOOR = "^[0-9]+$";
    public static final String REGEX_RENT = "^[A-Z][a-z0-9]{1,9}$";

    public static boolean isVillaFacility(String maDichVu) {
        return maDichVu.matches(REGEX_VILLA);
    }

    public static boolean isHouseFacility(String maDichVu) {
        return maDichVu.matches(REGEX_HOUSE);
    }

    public static boolean isRoomFacility(String maDichVu) {
        return maDichVu.matches(REGEX_RO);
    }

    public static boolean isVillaNameService(String tenDichVu) {
        return tenDichVu.matches(REGEX_TENDICHVU);
    }

    public static boolean isHouseNameService(String tenDichVu) {
        return tenDichVu.matches(REGEX_TENDICHVU);
    }

    public static boolean isRoomNameService(String tenDichVu) {
        return tenDichVu.matches(REGEX_TENDICHVU);
    }

    public static boolean isCostService(String chiPhiThue) {
        return chiPhiThue.matches(REGEX_COST);
    }

    public static boolean isFloorService(String soTang) {
        return soTang.matches(REGEX_FLOOR);
    }

    public static boolean isRentService(String kieuThue) {
        return kieuThue.matches(REGEX_RENT);
    }

    public static boolean isAreaService(String dienTichSuDung) {
        return dienTichSuDung.matches(REGEX_AREAUSE);
    }

    public static boolean isPeopleService(String soNguoiToiDa) {
        return soNguoiToiDa.matches(REGEX_MAXPEOPLE);
    }

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
