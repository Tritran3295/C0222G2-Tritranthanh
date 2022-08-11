package com.case_study.model;

import com.case_study.model.employee.Employee;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class User {
    @Id
    private String name;
    private String password;
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Employee> employees;

    @ManyToMany(mappedBy = "users")
    private Set<Role> roles;

    public User() {
    }

    public User(String name, String password, Set<Employee> employees, Set<Role> roles) {
        this.name = name;
        this.password = password;
        this.employees = employees;
        this.roles = roles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}

