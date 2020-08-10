package com.etrrat.web.rest;

import com.etrrat.domain.VariziHami;
import com.etrrat.repository.VariziRepository;
import com.etrrat.service.HamiService;
import com.etrrat.service.dto.HamiDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/varizi")
public class VariziController {

    @Autowired
    private VariziRepository variziRepository;

    @PostMapping
    public VariziHami getHami(@RequestBody VariziHami variziHami){
            return variziRepository.save(variziHami);
    }

}
