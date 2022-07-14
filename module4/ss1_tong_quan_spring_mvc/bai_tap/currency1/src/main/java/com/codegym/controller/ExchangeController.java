package com.codegym.controller;

import com.codegym.service.ExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ExchangeController {
    @Autowired
    private ExchangeService exchangeService;

    @GetMapping("/home")
    public String show() {
        return "exchange";
    }

    @GetMapping(value = "/currency")
    public String exchange(@RequestParam int usd, Model model) {
        int vnd = this.exchangeService.exchange(usd, 22000);
        model.addAttribute("vnd", vnd);
        return "exchange";
    }
}


