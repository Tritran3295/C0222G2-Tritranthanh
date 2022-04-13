package ss8_clean_code_refactoring.ThucHanh;

import java.util.Scanner;

public class Calculator {
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int calculate(int firstOperand, int secondOperand, char operator) {
        switch (operator) {
            case ADDITION:
                return firstOperand + secondOperand;
            case SUBTRACTION:
                return firstOperand - secondOperand;
            case MULTIPLICATION:
                return firstOperand * secondOperand;
            case DIVISION:
                if (secondOperand != 0)
                    return firstOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter firstOperator: ");
        int firstOperator = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter secondOperator: ");
        int secondOperator = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter operator: ");
        char operator = scanner.next().charAt(0);
        Calculator.calculate(firstOperator,secondOperator,operator);
        System.out.println("Result is: " +Calculator.calculate(firstOperator,secondOperator,operator));

    }
}
