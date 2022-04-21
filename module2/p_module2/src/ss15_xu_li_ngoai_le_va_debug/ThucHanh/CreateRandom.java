package ss15_xu_li_ngoai_le_va_debug.ThucHanh;

import java.util.Random;

public class CreateRandom {
    public Integer[] createRandom(){
        Random random = new Random();
        Integer [] arr = new Integer[100];
        for (int i = 0; i < 100; i++) {
            arr[i]= random.nextInt(100);
            System.out.println(arr[i] + "");
        }return arr;
    }
    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer[] arr = arrExample.createRandom();
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
//        int x = scanner.nextInt();
//        try {
//            System.out.println("Giá trị của phần tử có chỉ số 5" + x + " là " + arr[x]);
//        } catch (IndexOutOfBoundsException e) {
//            System.err.println("Chỉ số vượt quá giới hạn của mảng");
//        }
//    }


    }}
