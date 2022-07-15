package com.calculator.service.Impl;

import com.calculator.service.ICalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements ICalculatorService {
    @Override
    public int calculate(int numberOne, int numberTwo, String operation) {
        switch (operation) {
            case "+":
                return numberOne + numberTwo;
            case "-":
                return numberOne - numberTwo;
            case "*":
                return numberOne * numberTwo;
            default:
                return numberOne / numberTwo;
        }
    }
}
