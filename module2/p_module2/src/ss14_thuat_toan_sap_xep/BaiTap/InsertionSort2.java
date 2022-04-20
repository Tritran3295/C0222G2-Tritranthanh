package ss14_thuat_toan_sap_xep.BaiTap;

public class InsertionSort2 {
    static int[] list = {8, 5, 2, 7, 7, 12, 4, 0};
    public static void insertSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int x = list[i];
            int pos = i;
            for (int j = i + 1; j < list.length; j++) {
                if (x > list[j]) {
                    x = list[j];
                    pos = j;

                }
            }
            if (pos != i) {
                list[pos] = list[i];
                list[i] = x;
            }
        }
    }

    public static void main(String[] args) {
        insertSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]+ " ");
        }
    }
}
