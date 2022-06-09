package model.Employee;

public class Employee {
    private Integer idEmployee;
    private String nameEmployee;
    private String dayOfBirth;
    private String idCardEmployee;
    private Double salary;
    private String phone;
    private String email;
    private String address;
    private Integer idPosition;
    private Integer idDegreeEducation;
    private Integer idDivision;

    public Employee() {
    }
    public Employee(String nameEmployee, String dayOfBirth, String idCardEmployee, Double salary, String phone, String email, String address, Integer idPosition, Integer idDegreeEducation, Integer idDivision) {
        this.nameEmployee = nameEmployee;
        this.dayOfBirth = dayOfBirth;
        this.idCardEmployee = idCardEmployee;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.idPosition = idPosition;
        this.idDegreeEducation = idDegreeEducation;
        this.idDivision = idDivision;

    }


    public Employee(Integer idEmployee, String nameEmployee, String dayOfBirth, String idCardEmployee, Double salary, String phone, String email, String address, Integer idPosition, Integer idDegreeEducation, Integer idDivision) {
        this.idEmployee = idEmployee;
        this.nameEmployee = nameEmployee;
        this.dayOfBirth = dayOfBirth;
        this.idCardEmployee = idCardEmployee;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.idPosition = idPosition;
        this.idDegreeEducation = idDegreeEducation;
        this.idDivision = idDivision;
    }


    public Integer getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Integer idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getIdCardEmployee() {
        return idCardEmployee;
    }

    public void setIdCardEmployee(String idCardEmployee) {
        this.idCardEmployee = idCardEmployee;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(Integer idPosition) {
        this.idPosition = idPosition;
    }

    public Integer getIdDegreeEducation() {
        return idDegreeEducation;
    }

    public void setIdDegreeEducation(Integer idDegreeEducation) {
        this.idDegreeEducation = idDegreeEducation;
    }

    public Integer getIdDivision() {
        return idDivision;
    }

    public void setIdDivision(Integer idDivision) {
        this.idDivision = idDivision;
    }

}
