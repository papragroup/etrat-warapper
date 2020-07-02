package com.etrrat.service;

import com.etrrat.domain.Hami;
import com.etrrat.repository.HamiRepository;
import com.etrrat.service.dto.HamiDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HamiService {

    @Autowired
    private HamiRepository hamiRepository;

    public HamiDTO  getHamiList(Integer lastHamiId) {
        List<Hami> hamis = hamiRepository.findByHamiIdAfter(lastHamiId);
        HamiDTO hamiDTO = new HamiDTO();
        hamiDTO.setHamis(hamis);
        return hamiDTO;
    }
}
