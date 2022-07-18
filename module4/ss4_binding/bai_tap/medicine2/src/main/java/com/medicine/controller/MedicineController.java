package com.medicine.controller;

import com.medicine.model.MedicineClare;
import com.medicine.service.IMedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MedicineController {
    @Autowired
    private IMedicineService medicineService;

    @GetMapping("")
    public String showList(@ModelAttribute MedicineClare medicineClare, Model model) {
        model.addAttribute("medicineList", medicineService.selectAll(medicineClare));
        return "medicine/home";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("medicineCreate", new MedicineClare());
        return "medicine/create";
    }

    @PostMapping("/create")
    public String showForm(@ModelAttribute MedicineClare medicineClare) {
        medicineService.save(medicineClare);
        return "redirect:/";
    }

    @GetMapping("/edit")
    public String findId(@RequestParam("id") Integer id, Model model) {
        model.addAttribute("medicine", medicineService.findById(id));
        return "medicine/edit";
    }

    @PostMapping("/edit")
    public String save(@ModelAttribute MedicineClare medicineClare, Model model) {
        medicineService.update(medicineClare);
        return "redirect:/";
    }
}
