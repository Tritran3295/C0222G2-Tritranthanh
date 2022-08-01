package com.calculator.controller;

import com.calculator.service.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calculator {
    @Autowired
    private ICalculatorService calculatorService;

    @GetMapping("")
    public String show(){
        return "calculate";
    }
    @PostMapping("/calculating")
    public String calculating(@RequestParam int numberOne, @RequestParam int numberTwo,@RequestParam String operation, Model model){
        if(numberTwo == 0) {
            model.addAttribute("alert", "The number" + numberOne + " Not divide to 0");
        } else {
            model.addAttribute("result",calculatorService.calculate(numberOne,numberTwo,operation));
            model.addAttribute("numberOne",numberOne);
            model.addAttribute("numberTwo",numberTwo);
        }
        return "calculate";
    }
}
