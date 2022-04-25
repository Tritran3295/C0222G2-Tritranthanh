package ss17_binary_file_serialization.ThucHanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainStudent {
    public static void writeToFile(String path, List<Student> students){
        try{
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Trần Thanh Trí","Quảng Trị"));
        students.add(new Student(2,"Trần Thanh Trí 2","Quảng Trị 2"));
        students.add(new Student(3,"Trần Thanh Trí 3","Quảng Trị 3"));
        students.add(new Student(4,"Trần Thanh Trí 4","Quảng Trị 4"));
        students.add(new Student(5,"Trần Thanh Trí 5","Quảng Trị 5"));
    writeToFile("student.txt",students);
    List<Student> studentDataFromFile = readDataFromFile("student.txt");
    for(Student student:studentDataFromFile){
        System.out.println(student);
    }
    }
    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        }catch (Exception e){
            e.printStackTrace();
        }return students;
    }

}
