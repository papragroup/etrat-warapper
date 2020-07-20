package com.etrrat.service;

import com.etrrat.domain.Hami;
import com.etrrat.repository.HamiRepository;
import com.etrrat.repository.PaymentRepository;
import com.etrrat.service.dto.HamiDTO;
import com.etrrat.service.dto.HesabDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HamiService {

    @Autowired
    private HamiRepository hamiRepository;

    @Autowired
    private PaymentRepository paymentRepository;

    public HamiDTO  getHamiList(Integer lastHamiId) {
        List<Hami> hamis = hamiRepository.findByHamiIdAfter(lastHamiId);
        HamiDTO hamiDTO = new HamiDTO();
        hamiDTO.setHamis(hamis);
        return hamiDTO;
    }

    public HesabDTO getPaymentType() {
        HesabDTO hesabDTO=new HesabDTO();
        paymentRepository.findAll().forEach((p)->hesabDTO.getHesabDTOS().add(p));
        return hesabDTO;
    }
}
