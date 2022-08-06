package com.case_study.controller;

import com.case_study.dto.EmployeeDTO;
import com.case_study.model.employee.Employee;
import com.case_study.service.employee.IDivisionService;
import com.case_study.service.employee.IEducationDegreeService;
import com.case_study.service.employee.IEmployeeService;
import com.case_study.service.employee.IPositionService;
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
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;

    @Autowired
    private IPositionService positionService;

    @Autowired
    private IDivisionService divisionService;

    @Autowired
    private IEducationDegreeService educationDegreeService;

    @GetMapping("")
    public String showListEmployee(Model model, @PageableDefault(value = 5) Pageable pageable, Optional<String> nameSearch) {
        String searchName = nameSearch.orElse("");
        model.addAttribute("searchName", searchName);
        model.addAttribute("employeeList", employeeService.selectAll(searchName, pageable));
        model.addAttribute("positionList", positionService.selectAll());
        model.addAttribute("divisionList", divisionService.selectAll());
        model.addAttribute("educationDegreeList", educationDegreeService.selectAll());
        return "employee/list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("employeeListDTO", new EmployeeDTO());
        model.addAttribute("positionList", positionService.selectAll());
        model.addAttribute("divisionList", divisionService.selectAll());
        model.addAttribute("educationDegreeList", educationDegreeService.selectAll());
        return "employee/create";
    }

    @PostMapping("/create")
    public String create(@Valid @ModelAttribute("employeeListDTO") EmployeeDTO employeeDTO, BindingResult bindingResult,Model model) {
        if(bindingResult.hasErrors()){
            model.addAttribute("positionList", positionService.selectAll());
            model.addAttribute("divisionList", divisionService.selectAll());
            model.addAttribute("educationDegreeList", educationDegreeService.selectAll());
           return "employee/create";
        }
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeDTO,employee);
        employeeService.save(employee);
        return "redirect:/employees";
    }

    @GetMapping("/edit/{id}")
    public String showFormEdit(@PathVariable int id, Model model) {
        model.addAttribute("employeeList", employeeService.findById(id));
        model.addAttribute("positionList", positionService.selectAll());
        model.addAttribute("divisionList", divisionService.selectAll());
        model.addAttribute("educationDegreeList", educationDegreeService.selectAll());
        return "employee/edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Employee employee) {
        employeeService.update(employee);
        return "redirect:/employees";
    }

    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        employeeService.delete(id);
        return "redirect:/employees";
    }

}
