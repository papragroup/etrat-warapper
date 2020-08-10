package com.etrrat.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "VarizHami")
public class VariziHami implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CodeHesab")
    private String codehesab;

    @Column(name = "CodeHami")
    private String codehami;

    @Column(name = "TarixVariz")
    private String  tarixVarizi;

    @Column(name = "VarizType")
    private String  variziType;

    @Column(name = "Mablagh")
    private String  mablagh;


    public String getCodehesab() {
        return codehesab;
    }

    public void setCodehesab(String codehesab) {
        this.codehesab = codehesab;
    }

    public String getCodehami() {
        return codehami;
    }

    public void setCodehami(String codehami) {
        this.codehami = codehami;
    }

    public String getTarixVarizi() {
        return tarixVarizi;
    }

    public void setTarixVarizi(String tarixVarizi) {
        this.tarixVarizi = tarixVarizi;
    }

    public String getVariziType() {
        return variziType;
    }

    public void setVariziType(String variziType) {
        this.variziType = variziType;
    }

    public String getMablagh() {
        return mablagh;
    }

    public void setMablagh(String mablagh) {
        this.mablagh = mablagh;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
