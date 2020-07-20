package com.etrrat.service.dto;

import com.etrrat.domain.ZohaHesab;

import java.util.ArrayList;
import java.util.List;

public class HesabDTO {

    List<ZohaHesab> hesabDTOS=new ArrayList<>();


    public List<ZohaHesab> getHesabDTOS() {
        return hesabDTOS;
    }

    public void setHesabDTOS(List<ZohaHesab> hesabDTOS) {
        this.hesabDTOS = hesabDTOS;
    }
}
