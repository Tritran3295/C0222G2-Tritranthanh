package model.employee.employee;

public class Employee {
    private int idEmployee;
    private String nameEmployee;
    private String dateOfBirth;
    private String idCard;
    private Double salary;
    private String phoneNumber;
    private String email;
    private String address;
    private int idPosition;
    private int idEducationDegree;
    private int idDivision;
    private int status;

    public Employee() {
    }

    public Employee(int idEmployee, String nameEmployee, String dateOfBirth, String idCard, Double salary, String phoneNumber, String email, String address, int idPosition, int idEducationDegree, int idDivision,  int status) {
        this.idEmployee = idEmployee;
        this.nameEmployee = nameEmployee;
        this.dateOfBirth = dateOfBirth;
        this.idCard = idCard;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.idPosition = idPosition;
        this.idEducationDegree = idEducationDegree;
        this.idDivision = idDivision;
        this.status = status;
    }

    public Employee(String nameEmployee, String dateOfBirth, String idCard, Double salary, String phoneNumber, String email, String address, int idPosition, int idEducationDegree, int idDivision) {
        this.nameEmployee = nameEmployee;
        this.dateOfBirth = dateOfBirth;
        this.idCard = idCard;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.idPosition = idPosition;
        this.idEducationDegree = idEducationDegree;
        this.idDivision = idDivision;
    }

    public Employee(String nameEmployee, String dateOfBirth, String idCard, Double salary, String phoneNumber, String email, String address, int idPosition, int idEducationDegree, int idDivision, int status) {
        this.nameEmployee = nameEmployee;
        this.dateOfBirth = dateOfBirth;
        this.idCard = idCard;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.idPosition = idPosition;
        this.idEducationDegree = idEducationDegree;
        this.idDivision = idDivision;
        this.status = status;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public int getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(int idPosition) {
        this.idPosition = idPosition;
    }

    public int getIdEducationDegree() {
        return idEducationDegree;
    }

    public void setIdEducationDegree(int idEducationDegree) {
        this.idEducationDegree = idEducationDegree;
    }

    public int getIdDivision() {
        return idDivision;
    }

    public void setIdDivision(int idDivision) {
        this.idDivision = idDivision;
    }


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
