package keyStudy.Utils.File;

import keyStudy.model.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Currency;
import java.util.LinkedList;
import java.util.List;

public class ReadAndWriteBuffer {
    private static final String PATH_CUSTOMER = "src/keyStudy/data/customer.csv";
    private static final String PATH_EMPLOYEE = "src/keyStudy/data/employee.csv";
    private static final String PATH_VILLA = "src/keyStudy/data/vlvl.csv";
    private static final String PATH_ROOM = "src/keyStudy/data/room.csv";
    private static final String PATH_HOUSE = "src/keyStudy/data/house.csv";

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

    public static void writeEmployee(String path, List<Employee> list) {
        List<String> stringList = new ArrayList<>();
        for (Employee employee : list) {
            stringList.add(employee.convertLine());
        }
        writeToFile(path, stringList);
    }

    public static void writeCustomer(String path, List<Customer> customers) {
        List<String> stringList = new ArrayList<>();
        for (Customer customer : customers) {
            stringList.add(customer.convertLine());
        }
        writeToFile(path, stringList);
    }

    public static void writeVilla(String path, List<Villa> villas) {
        List<String> stringList = new ArrayList<>();
        for (Villa villa : villas) {
            stringList.add(villa.convertLine());
        }
        writeToFile(path, stringList);
    }

    public static void writeHouse(String path, List<House> houses) {
        List<String> stringList = new ArrayList<>();
        for (House house : houses) {
            stringList.add(house.convertLine());
        }
        writeToFile(path, stringList);
    }

    public static void writeRoom(String path, List<Room> rooms) {
        List<String> stringList = new ArrayList<>();
        for (Room room : rooms) {
            stringList.add(room.convertLine());
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

    public static List<Employee> readEmployee() {
        List<String> list = readFile(PATH_EMPLOYEE);
        List<Employee> employeeList = new ArrayList<>();
        String[] arr = null;
        for (String string : list) {
            arr = string.split(",");
            employeeList.add(new Employee(arr[0], Integer.parseInt(arr[1]), arr[2], Integer.parseInt(arr[3]), Integer.parseInt(arr[4]), arr[5], arr[6],
                    arr[7], arr[8], Double.parseDouble(arr[9])));
        }
        return employeeList;
    }

    public static List<Customer> readCustomer() {
        List<String> list = readFile(PATH_CUSTOMER);
        List<Customer> customerList = new LinkedList<>();
        String[] arr = null;
        for (String customer : list) {
            arr = customer.split(",");
            customerList.add(new Customer(arr[0], Integer.parseInt(arr[1]), arr[2], Integer.parseInt(arr[3]), Integer.parseInt(arr[4]), arr[5], arr[6],
                    arr[7], arr[8]));
        }
        return customerList;
    }

    public static List<Villa> readVilla() {
        List<String> list = readFile(PATH_VILLA);
        List<Villa> villaList = new ArrayList<>();
        String[] arr = null;
        for (String villa : list) {
            arr = villa.split(",");
            villaList.add(new Villa(arr[0], arr[1], arr[2], Double.parseDouble(arr[3]), Integer.parseInt(arr[4]), arr[5], arr[6], arr[7], Integer.parseInt(arr[8])));

        }
        return villaList;
    }

    public static List<Room> readRoom() {
        List<String> list = readFile(PATH_ROOM);
        List<Room> roomList = new ArrayList<>();
        String[] arr = null;
        for (String room : list) {
            arr = room.split(",");
            roomList.add(new Room(arr[0], arr[1], arr[2], Double.parseDouble(arr[3]), Integer.parseInt(arr[4]), arr[5], arr[6]));
        }
        return roomList;
    }

    public static List<House> readHouse() {
        List<String> list = readFile(PATH_HOUSE);
        List<House> houseList = new ArrayList<>();
        String[] arr = null;
        for (String house : list) {
            arr = house.split(",");
            houseList.add(new House(arr[0], arr[1], arr[2], Double.parseDouble(arr[3]), Integer.parseInt(arr[4]), arr[5], arr[6], Integer.parseInt(arr[7])));

        }return houseList;
    }
}
