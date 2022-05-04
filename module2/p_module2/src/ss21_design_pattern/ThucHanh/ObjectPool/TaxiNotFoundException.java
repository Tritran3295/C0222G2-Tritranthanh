package ss21_design_pattern.ThucHanh.ObjectPool;

public class TaxiNotFoundException extends RuntimeException{
    public TaxiNotFoundException(String message) {
        System.out.println(message);
    }
}
