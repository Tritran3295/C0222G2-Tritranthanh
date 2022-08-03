package com.case_study.controller;

import com.case_study.dto.CustomerDTO;
import com.case_study.model.customer.Customer;
import com.case_study.service.customer.ICustomerService;
import com.case_study.service.customer.ICustomerTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;
    @Autowired
    private ICustomerTypeService customerTypeService;

    @GetMapping("")
    public String showList(Model model, @PageableDefault(value = 10)Pageable pageable, Optional<String> nameSearch){
        String searchName = nameSearch.orElse("");
        model.addAttribute("searchName",searchName);
        model.addAttribute("customerList",customerService.selectAll(searchName,pageable));
        model.addAttribute("customerTypeList",customerTypeService.selectAll());
        return "customer/list";
    }
    @GetMapping("/create")
    public String showFormCreate(Model model){
        model.addAttribute("customerDTO",new CustomerDTO());
        model.addAttribute("customerTypeList",customerTypeService.selectAll());
        return "customer/create";
    }
    @PostMapping("/create")
    public String create(@Valid @ModelAttribute CustomerDTO customerDTO, BindingResult bindingResult,Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("customerTypeList",customerTypeService.selectAll());
            return "customer/create";
        }
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDTO,customer);
        customerService.save(customer);
        return "redirect:/customers";
    }
    @GetMapping("/edit/{id}")
    public String showFormEdit(@PathVariable int id, Model model){
        model.addAttribute("customer",customerService.findById(id));
        model.addAttribute("customerTypeList",customerTypeService.selectAll());
        return "customer/edit";
    }
    @PostMapping("/edit")
    public String edit(@ModelAttribute Customer customer){
        customerService.update(customer);
        return "redirect:/customers";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        customerService.delete(id);
        return "redirect:/customers";
    }
}
