package com.product.controller;
import com.product.model.Product;
import com.product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("")
    public String showList(Model model){
        model.addAttribute("products",productService.selectAll());
        return "index";
    }
    @GetMapping("/create")
    public String showForm(Model model){
        model.addAttribute("product",new Product());
        return "create";
    }
    @PostMapping("/create")
    public String create(@ModelAttribute Product product,Model model){
        productService.save(product);
        return "redirect:/product";
    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id,Model model){
        model.addAttribute("product",productService.findById(id));
        return "edit";
    }
    @PostMapping("/edit")
    public String update(@ModelAttribute Product product){
        productService.edit(product);
        return "redirect:/product";
    }
    @GetMapping("/delete/{id}")
    public String showFormDelete(@PathVariable int id, Model model){
        Product product = productService.findById(id);
        model.addAttribute("product",product);
        return "delete";
    }
    @GetMapping("/delete")
    public String delete(@ModelAttribute Product product){
        productService.delete(product.getId());
        return "redirect:/product";
    }
    @GetMapping("/searchByName")
    public String search(@RequestParam String search,Model model){
        model.addAttribute("products",productService.findByName(search));
        return "index";
    }
}
