package model.customer.customer;

public class Customer {
    private int idCustomer;
    private String nameCustomer;
    private String dayOfBirth;
    private int gender;
    private String idCard;
    private String phoneNumber;
    private String email;
    private String address;
    private int idCustomerType;
    private int status;

    public Customer() {
    }

    public Customer(int idCustomer, String nameCustomer, String dayOfBirth, int gender, String idCard, String phoneNumber, String email, String address, int idCustomerType, int status) {
        this.idCustomer = idCustomer;
        this.nameCustomer = nameCustomer;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.idCustomerType = idCustomerType;
        this.status = status;
    }

    public Customer(String nameCustomer, String dayOfBirth, int gender, String idCard, String phoneNumber, String email, String address, int idCustomerType) {
        this.nameCustomer = nameCustomer;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.idCustomerType = idCustomerType;
    }

    public Customer(int idCustomer, String nameCustomer, String dayOfBirth, int gender, String idCard, String phoneNumber, String email, String address, int idCustomerType) {
        this.idCustomer = idCustomer;
        this.nameCustomer = nameCustomer;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.idCustomerType = idCustomerType;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
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

    public int getIdCustomerType() {
        return idCustomerType;
    }

    public void setIdCustomerType(int idCustomerType) {
        this.idCustomerType = idCustomerType;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
