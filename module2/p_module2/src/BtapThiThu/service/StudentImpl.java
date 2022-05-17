package BtapThiThu.service;

import BtapThiThu.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentImpl implements IStudent {
    Scanner scanner = new Scanner(System.in);
    private static final List<Student> students = new ArrayList<>();

    static {
        students.add(new Student("SV-1989", "Nguyen Van A", 19 / 5 / 2022, "Nam", "12A1", 9));
        students.add(new Student("SV-1988", "Nguyen Van B", 18 / 5 / 2022, "Nam", "12A1", 10));
        students.add(new Student("SV-1987", "Nguyen Van C", 17 / 5 / 2022, "Nam", "12A1", 8));
    }

    @Override
    public void add() {
        System.out.println("Enter the code student: ");
        String code = scanner.nextLine();
        System.out.println("Enter the name of student: ");
        String name = scanner.nextLine();
        System.out.println("Enter the date of birth :");
        int dayOfBirth = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the gender: ");
        String gender = scanner.nextLine();
        System.out.println("Enter the level : ");
        String level = scanner.nextLine();
        System.out.println("Enter the point : ");
        int point = Integer.parseInt(scanner.nextLine());
        Student student = new Student(code, name, dayOfBirth, gender, level, point);
        students.add(student);

    }

    @Override
    public void display() {
        System.out.println("The List of student : ");
        for (Student student:students){
            System.out.println(student);
        }

    }

    @Override
    public void delete() {
        System.out.println("Enter the code you wanna delete :");
        String codePerson = scanner.nextLine();
        boolean flag = false;
        int choice;
        for (int i = 0; i < students.size(); i++) {
            if(codePerson.equalsIgnoreCase(students.get(i).getCodePerson())){
                flag=true;
                break;
            }
        }
        if(flag){
            do{
                System.out.println("Are you sure delete ? ");
                System.out.println("1.Yes \n 2.No");
                choice=Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        for (int i = 0; i < students.size(); i++) {
                            if(codePerson.equalsIgnoreCase(students.get(i).getCodePerson())){
                                students.remove(i);
                                break;
                            }
                        }
                        System.out.println("Deleted ");
                        flag =false;
                        break;
                    case 2:
                        System.out.println(" Not delete :");
                        flag=false;
                    default:
                        System.out.println("choose again");
                        break;
                }
            }while (flag);
        }


    }

    @Override
    public void search() {

    }
}
