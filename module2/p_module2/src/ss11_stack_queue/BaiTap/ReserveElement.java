package ss11_stack_queue.BaiTap;

import java.util.Stack;

public class ReserveElement {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.print("Mang ban dau: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        /**
         * duyet mang dua phan tu cua mang vao stack
         */
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        /**
         * dua phan tu tu stack ve lai mang ban dau
         */
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }

        System.out.println();
        System.out.print("Mang sau khi dao nguoc: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
