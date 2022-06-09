package model;

public class Division {
    private Integer idDivision;
    private String nameDivision;

    public Division() {
    }

    public Division(Integer idDivision, String nameDivision) {
        this.idDivision = idDivision;
        this.nameDivision = nameDivision;
    }

    public Integer getIdDivision() {
        return idDivision;
    }

    public void setIdDivision(Integer idDivision) {
        this.idDivision = idDivision;
    }

    public String getNameDivision() {
        return nameDivision;
    }

    public void setNameDivision(String nameDivision) {
        this.nameDivision = nameDivision;
    }
}
