package com.medicine.model;

public class MedicineDeclare {
    private int id;
    private String name;
    private String yearOfBirth;
    private String gender;
    private String country;
    private String idCard;
    private String vehicle;
    private String idVehicle;
    private String numberSheet;
    private String dayStart;
    private String dayEnd;
    private String activity14Day;

    public MedicineDeclare() {
    }

    public MedicineDeclare(int id, String name, String yearOfBirth, String gender, String country, String idCard, String vehicle, String idVehicle, String numberSheet, String dayStart, String dayEnd, String activity14Day) {
        this.id = id;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.country = country;
        this.idCard = idCard;
        this.vehicle = vehicle;
        this.idVehicle = idVehicle;
        this.numberSheet = numberSheet;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.activity14Day = activity14Day;
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

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getIdVehicle() {
        return idVehicle;
    }

    public void setIdVehicle(String idVehicle) {
        this.idVehicle = idVehicle;
    }

    public String getNumberSheet() {
        return numberSheet;
    }

    public void setNumberSheet(String numberSheet) {
        this.numberSheet = numberSheet;
    }

    public String getDayStart() {
        return dayStart;
    }

    public void setDayStart(String dayStart) {
        this.dayStart = dayStart;
    }

    public String getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(String dayEnd) {
        this.dayEnd = dayEnd;
    }

    public String getActivity14Day() {
        return activity14Day;
    }

    public void setActivity14Day(String activity14Day) {
        this.activity14Day = activity14Day;
    }
}
