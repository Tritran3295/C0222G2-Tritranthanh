package com.example.exambackend.dto;

import com.example.exambackend.model.CodeMedicalRecord;
import com.example.exambackend.model.CodePatient;

import javax.validation.constraints.NotBlank;

public class MedicalRecordDTO {
    private int id;
    @NotBlank
    private String name;
    @NotBlank
    private String dateIn;
    @NotBlank
    private String dateOut;
    @NotBlank
    private String reason;
    @NotBlank
    private String treatments;
    @NotBlank
    private String doctorTreatments;

    private CodePatient codePatient;
    private CodeMedicalRecord codeMedicalRecord;

    public MedicalRecordDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateIn() {
        return dateIn;
    }

    public void setDateIn(String dateIn) {
        this.dateIn = dateIn;
    }

    public String getDateOut() {
        return dateOut;
    }

    public void setDateOut(String dateOut) {
        this.dateOut = dateOut;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getTreatments() {
        return treatments;
    }

    public void setTreatments(String treatments) {
        this.treatments = treatments;
    }

    public String getDoctorTreatments() {
        return doctorTreatments;
    }

    public void setDoctorTreatments(String doctorTreatments) {
        this.doctorTreatments = doctorTreatments;
    }

    public CodePatient getCodePatient() {
        return codePatient;
    }

    public void setCodePatient(CodePatient codePatient) {
        this.codePatient = codePatient;
    }

    public CodeMedicalRecord getCodeMedicalRecord() {
        return codeMedicalRecord;
    }

    public void setCodeMedicalRecord(CodeMedicalRecord codeMedicalRecord) {
        this.codeMedicalRecord = codeMedicalRecord;
    }
}
