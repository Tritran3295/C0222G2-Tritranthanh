package model.employee.educationDegree;

public class EducationDegree {
    private int idEducationDegree;
    private String nameEducationDegree;
    private int status;

    public EducationDegree() {
    }

    public EducationDegree(int idEducationDegree, String nameEducationDegree, int status) {
        this.idEducationDegree = idEducationDegree;
        this.nameEducationDegree = nameEducationDegree;
        this.status = status;
    }

    public int getIdEducationDegree() {
        return idEducationDegree;
    }

    public void setIdEducationDegree(int idEducationDegree) {
        this.idEducationDegree = idEducationDegree;
    }

    public String getNameEducationDegree() {
        return nameEducationDegree;
    }

    public void setNameEducationDegree(String nameEducationDegree) {
        this.nameEducationDegree = nameEducationDegree;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
