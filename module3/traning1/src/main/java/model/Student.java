package model;

public class Student {
    private String codeStudent;
    private String nameStudent;
    private Integer idClass;

    public Student() {
    }

    public Student(String codeStudent, String nameStudent, Integer idClass) {
        this.codeStudent = codeStudent;
        this.nameStudent = nameStudent;
        this.idClass = idClass;
    }

    public String getCodeStudent() {
        return codeStudent;
    }

    public void setCodeStudent(String codeStudent) {
        this.codeStudent = codeStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public Integer getIdClass() {
        return idClass;
    }

    public void setIdClass(Integer idClass) {
        this.idClass = idClass;
    }
}
