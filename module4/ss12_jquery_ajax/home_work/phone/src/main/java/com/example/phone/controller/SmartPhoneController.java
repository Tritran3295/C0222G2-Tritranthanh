package com.example.phone.controller;

import com.example.phone.model.SmartPhone;
import com.example.phone.service.ISmartPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/smartphones")
@CrossOrigin
public class SmartPhoneController {
    @Autowired
    private ISmartPhoneService smartPhoneService;

    @GetMapping
    public ResponseEntity<List<SmartPhone>> getSmartList(){
        List<SmartPhone> smartPhoneList = smartPhoneService.selectAll();
        if(smartPhoneList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(smartPhoneList,HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<SmartPhone> findById(@PathVariable int id){
        Optional<SmartPhone> smartPhoneOptional = smartPhoneService.findSmartById(id);
        if(!smartPhoneOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(smartPhoneOptional.get(),HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<SmartPhone> create(@RequestBody SmartPhone smartPhone){
        return new ResponseEntity<>(smartPhoneService.saveSmart(smartPhone),HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<SmartPhone> updateSmart(@PathVariable int id,@RequestBody SmartPhone smartPhone){
        Optional<SmartPhone> smartPhoneOptional = smartPhoneService.findSmartById(id);
        if(!smartPhoneOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        smartPhone.setId(smartPhoneOptional.get().getId());
        return new ResponseEntity<>(smartPhoneService.saveSmart(smartPhone),HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<SmartPhone> deleteSmart(@PathVariable int id){
        Optional<SmartPhone> smartPhoneOptional = smartPhoneService.findSmartById(id);
        if(!smartPhoneOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        smartPhoneService.remove(id);
        return new ResponseEntity<>(smartPhoneOptional.get(),HttpStatus.NO_CONTENT);
    }

}
