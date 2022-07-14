package com.dictionary.controller;

import com.dictionary.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @Autowired
    private IDictionaryService dictionaryService;
    @GetMapping("/home")
    public String dictionary(){
        return "dictionary";
    }
    @GetMapping(value = "/translate")
    public String translating(@RequestParam String eng, Model model){
        String str1 = dictionaryService.translate(eng);
        model.addAttribute("str1",str1);
        return "dictionary";
    }
}
