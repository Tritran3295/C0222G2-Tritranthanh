package ss14_thuat_toan_sap_xep.ThucHanh;

public class BubbleShort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void bubbleShort(int[] list) {
        boolean needNextPass = true;
        for (int i = 0; i < list.length & needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[i + 1]) {
                    int temp = list[j];
                    list[j] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleShort(list);
        for (int i = 0; i < list.length ; i++) {
            System.out.println(list[i]+ "");
        }
    }
}
