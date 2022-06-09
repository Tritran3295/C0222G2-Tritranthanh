package model;

public class Role {
    private Integer idRole;
    private String nameRole;

    public Role() {
    }

    public Role(Integer idRole, String nameRole) {
        this.idRole = idRole;
        this.nameRole = nameRole;
    }

    public Integer getIdRole() {
        return idRole;
    }

    public void setIdRole(Integer idRole) {
        this.idRole = idRole;
    }

    public String getNameRole() {
        return nameRole;
    }

    public void setNameRole(String nameRole) {
        this.nameRole = nameRole;
    }
}
