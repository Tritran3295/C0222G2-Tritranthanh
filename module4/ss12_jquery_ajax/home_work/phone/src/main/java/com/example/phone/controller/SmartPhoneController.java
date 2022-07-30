package com.example.phone.controller;

import com.example.phone.service.ISmartPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/smartphones")
public class SmartPhoneController {
    @Autowired
    private ISmartPhoneService smartPhoneService;


}
