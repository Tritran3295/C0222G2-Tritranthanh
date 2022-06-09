package model;

public class Employee {
    private int id;
    private String nameEmployee;
    private String birthdayEmployee;
    private String idCardEmployee;
    private Double salary;
    private String phoneEmployee;
    private String email;
    private String address;
    private Integer position;
    private Integer degreeEducation;
    private Integer division;
    private String userName;

    public Employee() {
    }

    public Employee(int id, String nameEmployee, String birthdayEmployee, String idCardEmployee, Double salary, String phoneEmployee, String email, String address, Integer position, Integer degreeEducation, Integer division, String userName) {
        this.id = id;
        this.nameEmployee = nameEmployee;
        this.birthdayEmployee = birthdayEmployee;
        this.idCardEmployee = idCardEmployee;
        this.salary = salary;
        this.phoneEmployee = phoneEmployee;
        this.email = email;
        this.address = address;
        this.position = position;
        this.degreeEducation = degreeEducation;
        this.division = division;
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getBirthdayEmployee() {
        return birthdayEmployee;
    }

    public void setBirthdayEmployee(String birthdayEmployee) {
        this.birthdayEmployee = birthdayEmployee;
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

    public String getPhoneEmployee() {
        return phoneEmployee;
    }

    public void setPhoneEmployee(String phoneEmployee) {
        this.phoneEmployee = phoneEmployee;
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

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getDegreeEducation() {
        return degreeEducation;
    }

    public void setDegreeEducation(Integer degreeEducation) {
        this.degreeEducation = degreeEducation;
    }

    public Integer getDivision() {
        return division;
    }

    public void setDivision(Integer division) {
        this.division = division;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
