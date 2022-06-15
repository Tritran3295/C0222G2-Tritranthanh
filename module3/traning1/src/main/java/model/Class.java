package model;

public class Class {
    private Integer idClass;
    private String nameClass;

    public Class() {
    }

    public Class(Integer idClass, String nameClass) {
        this.idClass = idClass;
        this.nameClass = nameClass;
    }

    public Integer getIdClass() {
        return idClass;
    }

    public void setIdClass(Integer idClass) {
        this.idClass = idClass;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }
}
