package com.calculator.controller;

import com.calculator.service.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @Autowired
    private ICalculatorService calculatorService;

    @GetMapping("")
    public String calculator() {
        return "calculator";
    }

    @PostMapping("/calculate")
    public String calculate(@RequestParam int numberOne, @RequestParam int numberTwo, @RequestParam String calculating, Model model) {
        if (numberTwo == 0) {
            model.addAttribute("announcement", "The Numer" + numberOne + "Not divide to 0");
        } else {
            model.addAttribute("result", calculatorService.calculating(numberOne, numberTwo, calculating));
        }
        return "calculator";
    }
}