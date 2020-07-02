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
    private String hamiId;

    @Column
    private String shenase;

    public String getHamiId() {
        return hamiId;
    }

    public void setHamiId(String hamiId) {
        this.hamiId = hamiId;
    }

    public String getShenase() {
        return shenase;
    }

    public void setShenase(String shenase) {
        this.shenase = shenase;
    }
}
