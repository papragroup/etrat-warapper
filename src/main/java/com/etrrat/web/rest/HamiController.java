package com.etrrat.web.rest;

import com.etrrat.domain.Hami;
import com.etrrat.service.HamiService;
import com.etrrat.service.dto.HamiDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/hami")
public class HamiController {

    @Autowired
    private HamiService hamiService;

    @GetMapping
    public HamiDTO getHami(@RequestParam(name = "hami-id") Integer lastHamiId){
        return hamiService.getHamiList(lastHamiId);
    }
}
