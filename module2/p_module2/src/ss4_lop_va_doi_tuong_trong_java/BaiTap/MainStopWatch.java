package ss4_lop_va_doi_tuong_trong_java.BaiTap;

public class MainStopWatch {
    public static void main(String[] args) {
       long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            System.out.println("count");
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
