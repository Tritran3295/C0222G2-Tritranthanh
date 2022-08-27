package com.example.exambackend.controller;

import com.example.exambackend.dto.MedicalRecordDTO;
import com.example.exambackend.model.CodePatient;
import com.example.exambackend.model.MedicalRecord;
import com.example.exambackend.service.ICodeMedicalRecordService;
import com.example.exambackend.service.ICodePatientService;
import com.example.exambackend.service.IMedicalRecordService;
import org.aspectj.apache.bcel.classfile.Code;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/")
public class MedicalRecordController {
    @Autowired
    private IMedicalRecordService medicalRecordService;
    @Autowired
    private ICodePatientService codePatientService;

    @Autowired
    private ICodeMedicalRecordService codeMedicalRecordService;


    @GetMapping("/code-patient/list")
    public ResponseEntity<List<CodePatient>> getAllCodePatient(){
        List<CodePatient>codePatientList = this.codePatientService.findAll();
        return new ResponseEntity<>(codePatientList,HttpStatus.OK);
    }
    @GetMapping("/code-medical_record/list")
    public ResponseEntity<List<MedicalRecord>> getAllMedicalRecord(){
        List<MedicalRecord>medicalRecordList = this.codeMedicalRecordService.findAll();
        return new ResponseEntity<>(medicalRecordList,HttpStatus.OK);
    }

    @GetMapping("/benh-an")
    public ResponseEntity<Page<MedicalRecord>> getAllMedicalRecord(@PageableDefault(3)Pageable pageable,
                                                                   Optional<String> nameSearch){
        String searchName = nameSearch.orElse("");
        Page<MedicalRecord> medicalRecordPage = medicalRecordService.findAllMedicalRecord(pageable,searchName);
        if (medicalRecordPage.isEmpty()){
            return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else {
            return new ResponseEntity<>(medicalRecordPage,HttpStatus.OK);
        }
    }
    @PostMapping("/create")
    public ResponseEntity<MedicalRecord> createMedicalRecord(@Valid @RequestBody MedicalRecordDTO medicalRecordDTO){
        MedicalRecord medicalRecord = new MedicalRecord();
        BeanUtils.copyProperties(medicalRecordDTO,medicalRecord);
        return new ResponseEntity<>(medicalRecordService.save(medicalRecord), HttpStatus.CREATED);
    }
    @GetMapping("/findId/{id}")
    public ResponseEntity<MedicalRecord> findById(@PathVariable Integer id){
        if (id == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Optional<MedicalRecord> medicalRecordOptional = Optional.ofNullable(medicalRecordService.findById(id));
        return new ResponseEntity<>(medicalRecordOptional.get(),HttpStatus.OK);
    }
    @PatchMapping("/update/{id}")
    public ResponseEntity<MedicalRecord> updateMedicalRecord(@Valid @RequestBody MedicalRecordDTO medicalRecordDTO,@PathVariable Integer id){
        Optional<MedicalRecord> medicalRecordOptional = Optional.ofNullable(medicalRecordService.findById(id));
        MedicalRecord medicalRecord = new MedicalRecord();
        BeanUtils.copyProperties(medicalRecordDTO,medicalRecord);
        medicalRecord.setId(medicalRecordOptional.get().getId());
        return new ResponseEntity<>(medicalRecordService.save(medicalRecord),HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    private ResponseEntity<Void> deleteMedicalRecord(@PathVariable Integer id){
        medicalRecordService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
