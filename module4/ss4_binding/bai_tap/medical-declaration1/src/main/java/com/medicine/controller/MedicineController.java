package com.medicine.controller;

import com.medicine.model.MedicineDeclare;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MedicineController {

    @GetMapping("")
    public String showForm(Model model) {
        model.addAttribute("medicine", new MedicineDeclare());
        return "medicine";
    }

    @PostMapping("/create")
    public String createForm(@ModelAttribute MedicineDeclare medicineDeclare, Model model) {
        model.addAttribute("result", medicineDeclare);
        return "show";
    }
}
