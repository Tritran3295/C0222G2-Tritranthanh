package com.example.exambackend.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class CodePatient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @JsonBackReference
    @OneToMany(mappedBy = "codePatient")
    private List<MedicalRecord> medicalRecords;

    public CodePatient() {
    }

    public CodePatient(int id, String name, List<MedicalRecord> medicalRecords) {
        this.id = id;
        this.name = name;
        this.medicalRecords = medicalRecords;
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

    public List<MedicalRecord> getMedicalRecords() {
        return medicalRecords;
    }

    public void setMedicalRecords(List<MedicalRecord> medicalRecords) {
        this.medicalRecords = medicalRecords;
    }
}
