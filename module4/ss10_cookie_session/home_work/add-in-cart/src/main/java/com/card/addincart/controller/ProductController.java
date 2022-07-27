package com.card.addincart.controller;

import com.card.addincart.model.Cart;
import com.card.addincart.model.Product;
import com.card.addincart.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    private IProductService productService;

    @ModelAttribute("cart")
    public Cart setupCart(){
        return new Cart();
    }
    @GetMapping("/shop")
    public String show(Model model){
        model.addAttribute("products",productService.findAll());
        return "shop";
    }
    @GetMapping("/add/{id}")
    public String addToCart(@PathVariable Long id, @ModelAttribute Cart cart,
                            @RequestParam("action")String action){
        Optional<Product> productOptional = productService.findById(id);
        if(!productOptional.isPresent()){
            return "/error.404";
        }
        if (action.equals("add")){
            cart.addProduct(productOptional.get());
            return "redicrect:/shoppping-cart";
        }
        if(action.equals("show")){
            cart.addProduct(productOptional.get());
            return "redirect:/shopping-cart";
        }
        cart.addProduct(productOptional.get());
        return "redirect:/shop";
    }
    @GetMapping("/detail")
    public String showDetail(@RequestParam Long id,Model model){
        Optional<Product> productOptional = productService.findById(id);
        if(productOptional.isPresent()){
            model.addAttribute("product",productOptional.get());
            return "detail";
        }return "error.404";
    }
    @GetMapping("/total")
    public String totalCart(){
        return "redirect:/total-cart";
    }

}
