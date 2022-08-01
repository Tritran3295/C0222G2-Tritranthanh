package com.product.controller;

import com.product.model.Product;
import com.product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("")
    public String showList(Model model){
        List<Product> productList = productService.selectAll();
        model.addAttribute("products", productList);
        return "product/index";
    }
    @GetMapping("/create")
    public String showFormCreate(Model model){
        model.addAttribute("products",new Product());
        return "product/create";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute Product product){
        productService.save(product);
        return "redirect:/product";
    }
    @GetMapping("/{id}/edit")
    public String editForm(@PathVariable Integer id,Model model){
        model.addAttribute("products",productService.findById(id));
        return "product/edit";
    }
    @PostMapping("/update")
    public String update(Product product){
        productService.updateProduct(product);
        return "redirect:/product/";
    }
    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Integer id,Model model){
        model.addAttribute("products",productService.findById(id));
        return "product/delete";
    }
    @PostMapping("/delete")
    public String delete(Product product){
        productService.delete(product.getId());
        return "redirect:/product";
    }
    @GetMapping("/searchByName")
    public String searchByName(@RequestParam String searchValue, Model model){
        model.addAttribute("products",productService.findByName(searchValue));
        return "/product/index";
    }
    @GetMapping("/{id}/view")
    public String view(@PathVariable int id,Model model){
        model.addAttribute("products",productService.findById(id));
        return "product/view";
    }
}
