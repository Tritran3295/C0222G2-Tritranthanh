package ss999_ket_thuc_module.Utils;

import ss999_ket_thuc_module.model.HandPhone;
import ss999_ket_thuc_module.model.RealPhone;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    private static final String PATH_REALPHONE ="src/ss999_ket_thuc_module/data/handPhone.csv";
    private static final String PATH_HANDPHONE ="src/ss999_ket_thuc_module/data/realPhone.csv";

    private static void writeToFile(String path, List<String> stringList) {
        try {
            FileWriter fileWriter = new FileWriter(path);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (String string : stringList) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    public static void writeHandPhone(String path, List<HandPhone> list) {
        List<String> stringList = new ArrayList<>();
        for (HandPhone handPhone : list) {
            stringList.add(handPhone.convertLine());
        }
        writeToFile(path, stringList);
    }
    public static void writeRealPhone(String path, List<RealPhone> list) {
        List<String> stringList = new ArrayList<>();
        for (RealPhone realPhone : list) {
            stringList.add(realPhone.convertLine());
        }
        writeToFile(path, stringList);
    }
    public static List<String> readFile(String path) {
        List<String> stringList = new ArrayList<>();
        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }
    public static List<HandPhone> readHandPhone() {
        List<String> list = readFile(PATH_HANDPHONE);
        List<HandPhone> handPhoneList = new ArrayList<>();
        String[] arr = null;
        for (String string : list) {
            arr = string.split(",");
            handPhoneList.add(new HandPhone(Integer.parseInt(arr[0]),arr[1],Integer.parseInt(arr[2]),Integer.parseInt(arr[3]),
                    arr[4],arr[5],arr[6] ));

        }
        return handPhoneList;
    }
    public static List<RealPhone> readRealPhone() {
        List<String> list = readFile(PATH_REALPHONE);
        List<RealPhone> realPhoneList = new ArrayList<>();
        String[] arr = null;
        for (String string : list) {
            arr = string.split(",");
            realPhoneList.add(new RealPhone(Integer.parseInt(arr[0]),arr[1],Integer.parseInt(arr[2]),Integer.parseInt(arr[3]),
                    arr[4],Integer.parseInt(arr[5]),arr[6] ));

        }
        return realPhoneList;
    }

}
