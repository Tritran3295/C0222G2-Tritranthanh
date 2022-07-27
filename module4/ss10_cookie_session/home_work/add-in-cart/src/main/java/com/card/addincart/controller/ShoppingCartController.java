package com.card.addincart.controller;

import com.card.addincart.model.Cart;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShoppingCartController {
    @ModelAttribute("cart")
    public Cart setupCart(){
        return new Cart();
    }
    @GetMapping("/shopping-cart")
    public ModelAndView showCart(@SessionAttribute("cart")Cart cart){
        ModelAndView modelAndView = new ModelAndView("/cart");
        modelAndView.addObject("cart",cart);
        return modelAndView;
    }
    @GetMapping("/total-cart")
    public ModelAndView totalCart(@SessionAttribute("cart") Cart cart){
        cart.deleteCart();
        ModelAndView modelAndView = new ModelAndView("payment");
        modelAndView.addObject("cart", cart);
        return modelAndView;
    }
}
