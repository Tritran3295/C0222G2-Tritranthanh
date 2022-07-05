package model.employee.userRole;

public class UserRole {
    private int idRole;
    private String userName;
    private int status;

    public UserRole() {
    }

    public UserRole(int idRole, String userName, int status) {
        this.idRole = idRole;
        this.userName = userName;
        this.status = status;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
