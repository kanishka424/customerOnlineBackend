package com.tech.hitachi.customerregistration.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
public class Customer {

    @Id
    private String nicNumber;

    private String firstName;
    private String lastName;
    private LocalDate regDate;
    private LocalDate dob;
    private double annualIncome;
    private String userName;
    private String password;
   // private List<Remark> remarks;


    public Customer() {

    }

//    public Customer(String nicNumber, String firstName, String lastName, Date regDate, Date dob, double annualIncome, String userName, String password,List<Remark> remarks) {
//        this.nicNumber = nicNumber;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.regDate = regDate;
//        this.dob = dob;
//        this.annualIncome = annualIncome;
//        this.userName = userName;
//        this.password = password;
//        this.remarks=remarks;
//    }


    public Customer(String nicNumber, String firstName, String lastName, LocalDate regDate, LocalDate dob, double annualIncome, String userName, String password) {
        this.nicNumber = nicNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.regDate = regDate;
        this.dob = dob;
        this.annualIncome = annualIncome;
        this.userName = userName;
        this.password = password;

    }

    public String getNicNumber() {
        return nicNumber;
    }

    public void setNicNumber(String nicNumber) {
        this.nicNumber = nicNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
