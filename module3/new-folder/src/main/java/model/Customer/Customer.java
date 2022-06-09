package model.Customer;

public class Customer {
    private Integer idCustomer;
    private String nameCustomer;
    private String birthday;
    private Integer gender;
    private String idCard;
    private String phone;
    private String email;
    private String address;
    private Integer idTypeCustomer;

    public Customer() {
    }

    public Customer(String nameCustomer, String birthday, Integer gender, String idCard, String phone, String email, String address, Integer idTypeCustomer) {
        this.nameCustomer = nameCustomer;
        this.birthday = birthday;
        this.gender = gender;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.idTypeCustomer = idTypeCustomer;
    }

    public Customer(Integer idCustomer, String nameCustomer, String birthday, Integer gender, String idCard, String phone, String email, String address, Integer idTypeCustomer) {
        this.idCustomer = idCustomer;
        this.nameCustomer = nameCustomer;
        this.birthday = birthday;
        this.gender = gender;
        this.idCard = idCard;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
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

    public Integer getIdTypeCustomer() {
        return idTypeCustomer;
    }

    public void setIdTypeCustomer(Integer idTypeCustomer) {
        this.idTypeCustomer = idTypeCustomer;
    }

}
