package com.product.controller;

import com.product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
    @Autowired
    private IProductService productService;
    @GetMapping("")
    public String showList(Model model){
        model.addAttribute("products",productService.selectAll());
        return "product/index";
    }
    @GetMapping("/searchByName")
    public String searchByName(@RequestParam String searchValue,Model model){
        model.addAttribute("products",productService.findByName(searchValue));
        return "/product/index";
    }
}
