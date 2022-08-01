package com.medicine.model;

public class MedicineClare {
    private int id;
    private String name;
    private String yearOfBirth;
    private String vehicle;
    private String dayStart;
    private String dayEnd;
    private String activity14Day;

    public MedicineClare() {
    }

    public MedicineClare(int id, String name, String yearOfBirth, String vehicle, String dayStart, String dayEnd, String activity14Day) {
        this.id = id;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.vehicle = vehicle;
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

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
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
