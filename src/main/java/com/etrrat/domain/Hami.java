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
