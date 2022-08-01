package com.email.controller;

import com.email.model.Email;
import com.email.service.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class EmailController {
    @Autowired
    private IEmailService emailService;

    @GetMapping("")
    public String show(Model model){
        model.addAttribute("email",new Email());
        return "email";
    }
    @PostMapping("/createEmail")
    public String createEmail(@ModelAttribute Email email,Model model){
       emailService.save(email);
       model.addAttribute("mailBox",email);
       return "mailBox";
    }


}
