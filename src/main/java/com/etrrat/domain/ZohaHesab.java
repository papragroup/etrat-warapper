package com.etrrat.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Hesab")
public class ZohaHesab {


    @Column(name = "CodeHesab")
    @Id
    private String codehesab;

    @Column(name = "namehesab")
    private String namehesab;


    public String getCodehesab() {
        return codehesab;
    }

    public void setCodehesab(String codehesab) {
        this.codehesab = codehesab;
    }

    public String getNamehesab() {
        return namehesab;
    }

    public void setNamehesab(String namehesab) {
        this.namehesab = namehesab;
    }
}
