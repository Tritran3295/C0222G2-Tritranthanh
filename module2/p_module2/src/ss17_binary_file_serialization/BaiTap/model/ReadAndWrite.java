package ss17_binary_file_serialization.BaiTap.model;

import ss17_binary_file_serialization.BaiTap.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    private final static String FILE_NAME = "src/ss17_binary_file_serialization/BaiTap/Product.dat";
    public static void writeToFile(List<Product> products){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static  List<Product> readToFile(){
        List<Product> products = new ArrayList<>();
        try{
            FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            products=(List<Product>)objectInputStream.readObject() ;
            objectInputStream.close();
            fileInputStream.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }return products;
    }
}
