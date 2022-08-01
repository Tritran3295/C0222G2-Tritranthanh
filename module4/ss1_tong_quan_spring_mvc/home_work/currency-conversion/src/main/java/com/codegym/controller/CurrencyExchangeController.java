package com.codegym.controller;

import com.codegym.service.ICurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyExchangeController {

    @Autowired
    private ICurrencyService currencyService;

    @GetMapping("/home")
    public String show() {
        return "exchange";
    }

    @GetMapping(value = "/currency")
    public String exchange(@RequestParam int usd, Model model) {
        int vnd = this.currencyService.exchange(usd, 22000);
        model.addAttribute("vnd", vnd);
        return "exchange";
    }
}
