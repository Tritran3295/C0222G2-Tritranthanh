package model.rentType;

public class RentType {
    private int idRentType;
    private String nameRentType;

    public RentType() {
    }

    public RentType(int idFacilityType, String nameFacilityType) {
        this.idRentType = idFacilityType;
        this.nameRentType = nameFacilityType;
    }

    public int getIdRentType() {
        return idRentType;
    }

    public void setIdRentType(int idRentType) {
        this.idRentType = idRentType;
    }

    public String getNameFacilityType() {
        return nameRentType;
    }

    public void setNameFacilityType(String nameFacilityType) {
        this.nameRentType = nameFacilityType;
    }
}
