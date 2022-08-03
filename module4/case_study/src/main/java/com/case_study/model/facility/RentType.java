package com.case_study.model.facility;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class RentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nameRentType;

    @JsonBackReference
    @OneToMany(mappedBy = "rentType")
    private List<Facility> facilityList;

    public RentType() {
    }

    public RentType(int id, String nameRentType, List<Facility> facilityList) {
        this.id = id;
        this.nameRentType = nameRentType;
        this.facilityList = facilityList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameRentType() {
        return nameRentType;
    }

    public void setNameRentType(String nameRentType) {
        this.nameRentType = nameRentType;
    }

    public List<Facility> getFacilityList() {
        return facilityList;
    }

    public void setFacilityList(List<Facility> facilityList) {
        this.facilityList = facilityList;
    }
}
