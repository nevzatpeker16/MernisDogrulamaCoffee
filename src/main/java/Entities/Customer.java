package Entities;


import Abstract.Entity;

import java.util.Date;

public class Customer implements Entity {
     int customerID;
     String firstName;
     String lastName;
     String nationalityID;
     int  dateOfBirth;
     int firmID;

    public Customer(int customerID, String firstName, String lastName, String nationalityID, int dateOfBirth, int firmID) {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalityID = nationalityID;
        this.dateOfBirth = dateOfBirth;
        this.firmID = firmID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
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

    public String getNationalityID() {
        return nationalityID;
    }

    public void setNationalityID(String nationalityID) {
        this.nationalityID = nationalityID;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getFirmID() {
        return firmID;
    }

    public void setFirmID(int firmID) {
        this.firmID = firmID;
    }
}
