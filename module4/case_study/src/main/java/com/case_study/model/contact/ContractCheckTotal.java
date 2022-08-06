package com.case_study.model.contact;

import com.case_study.model.customer.Customer;
import com.case_study.model.employee.Employee;
import com.case_study.model.facility.Facility;

import java.util.List;

public class ContractCheckTotal {
    private Integer id;
    private String dateCheckIn;
    private String dateCheckOut;
    private Double deposit;
    private Customer customer;
    private Employee employee;
    private Facility facility;
    private List<ContractDetail> contractDetailList;
    private Double totalMoney;

    public ContractCheckTotal() {
    }

    public ContractCheckTotal(Integer id, String dateCheckIn, String dateCheckOut, Double deposit, Customer customer, Employee employee, Facility facility, List<ContractDetail> contractDetailList, Double totalMoney) {
        this.id = id;
        this.dateCheckIn = dateCheckIn;
        this.dateCheckOut = dateCheckOut;
        this.deposit = deposit;
        this.customer = customer;
        this.employee = employee;
        this.facility = facility;
        this.contractDetailList = contractDetailList;
        this.totalMoney = totalMoney;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDateCheckIn() {
        return dateCheckIn;
    }

    public void setDateCheckIn(String dateCheckIn) {
        this.dateCheckIn = dateCheckIn;
    }

    public String getDateCheckOut() {
        return dateCheckOut;
    }

    public void setDateCheckOut(String dateCheckOut) {
        this.dateCheckOut = dateCheckOut;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public List<ContractDetail> getContractDetailList() {
        return contractDetailList;
    }

    public void setContractDetailList(List<ContractDetail> contractDetailList) {
        this.contractDetailList = contractDetailList;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }
}
