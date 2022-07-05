package model.employee.role;

public class Role {
    private int idRole;
    private String nameRole;
    private int status;

    public Role() {
    }

    public Role(int idRole, String nameRole, int status) {
        this.idRole = idRole;
        this.nameRole = nameRole;
        this.status = status;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String getNameRole() {
        return nameRole;
    }

    public void setNameRole(String nameRole) {
        this.nameRole = nameRole;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
