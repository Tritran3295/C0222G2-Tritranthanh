package com.case_study.model.employee;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class EducationDegree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nameEducationDegree;

    @JsonBackReference
    @OneToMany(mappedBy = "educationDegree")
    private List<Employee> educationDegreeList;

    public EducationDegree() {
    }

    public EducationDegree(int id, String nameEducationDegree, List<Employee> educationDegreeList) {
        this.id = id;
        this.nameEducationDegree = nameEducationDegree;
        this.educationDegreeList = educationDegreeList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameEducationDegree() {
        return nameEducationDegree;
    }

    public void setNameEducationDegree(String nameEducationDegree) {
        this.nameEducationDegree = nameEducationDegree;
    }

    public List<Employee> getEducationDegreeList() {
        return educationDegreeList;
    }

    public void setEducationDegreeList(List<Employee> educationDegreeList) {
        this.educationDegreeList = educationDegreeList;
    }
}
