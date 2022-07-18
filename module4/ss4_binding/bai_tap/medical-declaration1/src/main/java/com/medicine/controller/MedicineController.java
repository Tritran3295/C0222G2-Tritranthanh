package com.medicine.controller;

import com.medicine.model.MedicineDeclare;
import com.medicine.service.IMedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class MedicineController {
    @Autowired
    IMedicineService medicineService;


    @GetMapping("")
    public String showMedic(Model model){
        List<MedicineDeclare> medicineDeclareList = medicineService.selectAll();
        model.addAttribute("medicineList",medicineDeclareList);
        return "medicine/index";
    }

    @GetMapping("/create")
    public String showForm(Model model) {
        model.addAttribute("medicine", new MedicineDeclare());
        return "medicine/create";
    }

    @PostMapping("/create")
    public String createForm(@ModelAttribute MedicineDeclare medicineDeclare, Model model) {
        medicineService.save(medicineDeclare);
        model.addAttribute("result",medicineDeclare);
        return "redirect:/";
    }

    @GetMapping("/edit")
    public String showEdit(@ModelAttribute MedicineDeclare medicineDeclare,Model model){
        model.addAttribute("medicineEdit",medicineDeclare);
        return "medicine/edit";
    }
//    @PostMapping("/edit")
//    public String editForm(@ModelAttribute MedicineDeclare medicineDeclare,Model model){
//        medicineService.edit(medicineDeclare);
//
//    }
}
