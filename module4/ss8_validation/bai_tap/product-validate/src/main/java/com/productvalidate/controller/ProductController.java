package com.productvalidate.controller;

import com.productvalidate.dto.ProductDTO;
import com.productvalidate.model.Product;
import com.productvalidate.service.IHostProductService;
import com.productvalidate.service.IProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private IProductService productService;
    @Autowired
    private IHostProductService hostProductService;

    @GetMapping("")
    public String showList(Model model) {
        model.addAttribute("productList", productService.selectAll());
        model.addAttribute("hostProductList", hostProductService.selectAll());
        return "index";
    }
    @GetMapping("/create")
    public String showFormCreate(Model model){
        model.addAttribute("productDTO",new ProductDTO());
        model.addAttribute("hostProductList",hostProductService.selectAll());
        return "create";
    }
    @PostMapping("/create")
    public String create(@Valid @ModelAttribute ProductDTO productDTO, BindingResult bindingResult,Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("hostProductList",hostProductService.selectAll());
            return "create";
        }
        Product product = new Product();
        BeanUtils.copyProperties(productDTO,product);
        productService.save(product);
        return "redirect:/products";
    }
}
