package com.example.exambackend.model;

import javax.persistence.*;

@Entity
public class MedicalRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String dateIn;
    private String dateOut;
    private String reason;
    private String treatments;
    private String doctorTreatments;

    @ManyToOne
    @JoinColumn(name = "code_patient_id",referencedColumnName = "id")
    private CodePatient codePatient;

    @ManyToOne
    @JoinColumn(name = "code_medical_record_id",referencedColumnName = "id")
    private CodeMedicalRecord codeMedicalRecord;

    public MedicalRecord() {
    }

    public MedicalRecord(int id, String name, String dateIn, String dateOut, String reason, String treatments, String doctorTreatments, CodePatient codePatient, CodeMedicalRecord codeMedicalRecord) {
        this.id = id;
        this.name = name;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
        this.reason = reason;
        this.treatments = treatments;
        this.doctorTreatments = doctorTreatments;
        this.codePatient = codePatient;
        this.codeMedicalRecord = codeMedicalRecord;
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
