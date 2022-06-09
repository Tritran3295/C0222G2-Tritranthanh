package model;

public class DegreeEducation {
    private Integer idDegreeEducation;
    private String nameDegreeEducation;

    public DegreeEducation() {
    }

    public DegreeEducation(Integer idDegreeEducation, String nameDegreeEducation) {
        this.idDegreeEducation = idDegreeEducation;
        this.nameDegreeEducation = nameDegreeEducation;

    }

    public Integer getIdDegreeEducation() {
        return idDegreeEducation;
    }

    public void setIdDegreeEducation(Integer idDegreeEducation) {
        this.idDegreeEducation = idDegreeEducation;
    }

    public String getNameDegreeEducation() {
        return nameDegreeEducation;
    }

    public void setNameDegreeEducation(String nameDegreeEducation) {
        this.nameDegreeEducation = nameDegreeEducation;
    }
}
