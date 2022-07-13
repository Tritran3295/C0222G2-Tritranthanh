package model.facilityType;

public class FacilityType {
    private int idFacilityType;
    private String nameFacilityType;
    private  int status;

    public FacilityType() {
    }

    public FacilityType(int idFacilityType, String nameFacilityType, int status) {
        this.idFacilityType = idFacilityType;
        this.nameFacilityType = nameFacilityType;
        this.status = status;
    }

    public int getIdFacilityType() {
        return idFacilityType;
    }

    public void setIdFacilityType(int idFacilityType) {
        this.idFacilityType = idFacilityType;
    }

    public String getNameFacilityType() {
        return nameFacilityType;
    }

    public void setNameFacilityType(String nameFacilityType) {
        this.nameFacilityType = nameFacilityType;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
