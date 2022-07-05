package model.employee.division;

public class Division {
    private int idDivision;
    private String nameDivision;
    private int status;

    public Division() {
    }

    public Division(int idDivision, String nameDivision, int status) {
        this.idDivision = idDivision;
        this.nameDivision = nameDivision;
        this.status = status;
    }

    public int getIdDivision() {
        return idDivision;
    }

    public void setIdDivision(int idDivision) {
        this.idDivision = idDivision;
    }

    public String getNameDivision() {
        return nameDivision;
    }

    public void setNameDivision(String nameDivision) {
        this.nameDivision = nameDivision;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
