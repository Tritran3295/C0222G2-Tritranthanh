package model.facility;

public class Facility {
    private int idFacility;
    private String nameFacility;
    private int area;
    private Double cost;
    private int maxPeople;
    private int idRentType;
    private int idFacilityType;
    private String standardRoom;
    private String descriptionOtherConvenience;
    private Double poolArea;
    private int numberFloor;
    private String facilityFree;
    private int status;

    public Facility() {
    }

    public Facility(int idFacility, String nameFacility, int area, Double cost, int maxPeople, int idRentType, int idFacilityType, String standardRoom, String descriptionOtherConvenience, Double poolArea, int numberFloor, String facilityFree, int status) {
        this.idFacility = idFacility;
        this.nameFacility = nameFacility;
        this.area = area;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.idRentType = idRentType;
        this.idFacilityType = idFacilityType;
        this.standardRoom = standardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.poolArea = poolArea;
        this.numberFloor = numberFloor;
        this.facilityFree = facilityFree;
        this.status = status;
    }



    public Facility(String nameFacility, int area, Double cost, int maxPeople, String roomStandard, String descriptionOther, Double areaPool, int numberFloor, int idRentType, int idTypeService) {
        this.nameFacility = nameFacility;
        this.area = area;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.idRentType = idRentType;
        this.idFacilityType = idFacilityType;
        this.standardRoom = standardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.poolArea = poolArea;
        this.numberFloor = numberFloor;
        this.facilityFree = facilityFree;
    }

    public Facility(String name, int area, Double cost, int maxPeople, int idRentType, int idFacilityType, String standardRoom, String descriptionOtherConvenience, Double poolArea, int numberFloor, String facilityFree) {
        this.nameFacility = nameFacility;
        this.area = area;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.idRentType = idRentType;
        this.idFacilityType = idFacilityType;
        this.standardRoom = standardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.poolArea = poolArea;
        this.numberFloor = numberFloor;
        this.facilityFree = facilityFree;
    }

    public int getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(int idFacility) {
        this.idFacility = idFacility;
    }

    public String getNameFacility() {
        return nameFacility;
    }

    public void setNameFacility(String nameFacility) {
        this.nameFacility = nameFacility;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public int getIdRentType() {
        return idRentType;
    }

    public void setIdRentType(int idRentType) {
        this.idRentType = idRentType;
    }

    public int getIdFacilityType() {
        return idFacilityType;
    }

    public void setIdFacilityType(int idFacilityType) {
        this.idFacilityType = idFacilityType;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescriptionOtherConvenience() {
        return descriptionOtherConvenience;
    }

    public void setDescriptionOtherConvenience(String descriptionOtherConvenience) {
        this.descriptionOtherConvenience = descriptionOtherConvenience;
    }

    public Double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(Double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    public String getFacilityFree() {
        return facilityFree;
    }

    public void setFacilityFree(String facilityFree) {
        this.facilityFree = facilityFree;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
