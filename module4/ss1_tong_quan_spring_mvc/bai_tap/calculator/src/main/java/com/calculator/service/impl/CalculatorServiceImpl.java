package com.calculator.service.impl;

import com.calculator.service.ICalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements ICalculatorService {

    @Override
    public int calculating(int numberOne, int numberTwo,String calculating) {
        switch (calculating){
            case "+":
                return    numberOne + numberTwo;
            case "-":
                return numberOne - numberTwo;
            case "*":
                return numberOne * numberTwo;
            default:
                return numberOne / numberTwo;
        }
    }
}
