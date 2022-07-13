package model.rentType;

public class RentType {
    private int idRentType;
    private String nameRentType;
    private int status;

    public RentType() {
    }

    public RentType(int idRentType, String nameRentType, int status) {
        this.idRentType = idRentType;
        this.nameRentType = nameRentType;
        this.status = status;
    }

    public int getIdRentType() {
        return idRentType;
    }

    public void setIdRentType(int idRentType) {
        this.idRentType = idRentType;
    }

    public String getNameRentType() {
        return nameRentType;
    }

    public void setNameRentType(String nameRentType) {
        this.nameRentType = nameRentType;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
