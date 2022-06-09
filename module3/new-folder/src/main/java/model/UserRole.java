package model;

public class UserRole {
    private Integer idRole;
    private String userName;

    public UserRole() {
    }

    public UserRole(Integer idRole, String userName) {
        this.idRole = idRole;
        this.userName = userName;
    }

    public Integer getIdRole() {
        return idRole;
    }

    public void setIdRole(Integer idRole) {
        this.idRole = idRole;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
