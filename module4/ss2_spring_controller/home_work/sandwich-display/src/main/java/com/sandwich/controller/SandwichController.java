package com.sandwich.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@Controller
public class SandwichController {
    @GetMapping("")
    public String showCondiment(){
        return "index";
    }
   @PostMapping("/save")
    public String save(@RequestParam(defaultValue = "") String[] condiment, Model model){
        model.addAttribute("condiment", Arrays.toString(condiment));
        return "index";
    }
}
