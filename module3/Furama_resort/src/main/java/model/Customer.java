package model;

public class Customer {
    private Integer idCustomer;
    private String nameCustomer;
    private String dateOfBirth;
    private Integer gender;
    private String idCardCustomer;
    private String phone;
    private String email;
    private String address;
    private CustomerType idTypeCustomer;

    public Customer() {
    }

    public Customer(Integer idCustomer, String nameCustomer, String dateOfBirth, Integer gender, String idCardCustomer, String phone, String email, String address, CustomerType idTypeCustomer) {
        this.idCustomer = idCustomer;
        this.nameCustomer = nameCustomer;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.idCardCustomer = idCardCustomer;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.idTypeCustomer = idTypeCustomer;
    }



    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getIdCardCustomer() {
        return idCardCustomer;
    }

    public void setIdCardCustomer(String idCardCustomer) {
        this.idCardCustomer = idCardCustomer;
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

    public String getIdTypeCustomer() {
        return idTypeCustomer;
    }

    public void setIdTypeCustomer(CustomerType idTypeCustomer) {
        this.idTypeCustomer = idTypeCustomer;
    }
}
