package com.email.controller;

import com.email.model.Email;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmailController {
    @GetMapping("")
    public String show(Model model) {
        model.addAttribute("email", new Email());
        return "email";
    }

    @PostMapping("updateMail")
    public String updateEmail(@ModelAttribute Email email, Model model) {
        model.addAttribute("mailBox", email);
        return "mailBox";
    }

}
