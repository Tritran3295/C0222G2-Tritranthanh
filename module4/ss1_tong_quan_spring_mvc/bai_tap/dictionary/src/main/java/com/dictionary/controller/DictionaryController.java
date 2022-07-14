package com.dictionary.controller;

import com.dictionary.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/dictionary")
public class DictionaryController {
    @Autowired
    IDictionaryService iDictionaryService;
    @GetMapping("")
    public String showFormSearch(){
        return "word";
    }
    @GetMapping(value = "/translate")
    public String translate(@RequestParam String eng, Model model){
        String str = this.iDictionaryService.findDictionary(eng);
        model.addAttribute("str",str);
        return "word";
    }
}
