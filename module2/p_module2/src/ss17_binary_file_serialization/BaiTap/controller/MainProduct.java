package ss17_binary_file_serialization.BaiTap.controller;

import ss17_binary_file_serialization.BaiTap.service.ProductImpl;

import java.util.Scanner;

public class MainProduct {
    Scanner scanner = new Scanner(System.in);
    ProductImpl product = new ProductImpl();
    public void display(){
        while (true){
            System.out.println("Select option : ");
            System.out.println("---------Menu---------\n" +
                    " 1.display \n" +
                    " 2.Add a new Product \n " +
                    "3.Search Product \n "+
                    "4.Delete \n" +
                    "0.Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    product.display();
                    break;
                case 2:
                    product.add();
                    break;
                case 3:
                   product.search();
                    break;
                case 4:
                    product.delete();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }



}

