package com.etrrat.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Hami")
public class Hami {


    @Column(name = "Hamiid")
    @Id
    private Integer hamiId;

    @Column
    private Integer shenase;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "CellPhone")
    private String CellPhone;


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

    @Column(name = "CellPhone")
    public String getCellPhone() {
        return CellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.CellPhone = cellPhone;
    }

    public Integer getHamiId() {
        return hamiId;
    }

    public void setHamiId(Integer hamiId) {
        this.hamiId = hamiId;
    }

    public Integer getShenase() {
        return shenase;
    }

    public void setShenase(Integer shenase) {
        this.shenase = shenase;
    }
}
