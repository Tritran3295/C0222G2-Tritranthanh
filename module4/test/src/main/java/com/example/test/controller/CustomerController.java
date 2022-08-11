package com.example.test.controller;

import com.example.test.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping("")
    public String showList(Model model, @PageableDefault(value = 4) Pageable pageable, Optional<String> nameSearch
                          ){
        String searchName = nameSearch.orElse("");

        model.addAttribute("customerList",customerService.selectAll(searchName,pageable));
        return "list";
    }
}
