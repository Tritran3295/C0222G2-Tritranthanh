package com.example.productupdate.controller;

import com.example.productupdate.model.Product;
import com.example.productupdate.service.IHostProductService;
import com.example.productupdate.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private IProductService productService;
    @Autowired
    private IHostProductService hostProductService;

    @GetMapping("")
    public String showListProduct(Model model, @PageableDefault(value = 3) Pageable pageable, Optional<String> nameSearch) {
        String searchName = nameSearch.orElse("");
        model.addAttribute("searchName", searchName);
        model.addAttribute("productList", productService.selectAll(searchName, pageable));
        model.addAttribute("hostList", hostProductService.selectALl());
        return "index";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("hostProductList", hostProductService.selectALl());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Product product) {
        productService.save(product);
        return "redirect:/products";
    }

    @GetMapping("/edit/{id}")
    public String showFormEdit(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        model.addAttribute("hostProductList", hostProductService.selectALl());
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Product product) {
        productService.update(product);
        return "redirect:/products";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        productService.delete(id);
        return "redirect:/products";
    }
}
