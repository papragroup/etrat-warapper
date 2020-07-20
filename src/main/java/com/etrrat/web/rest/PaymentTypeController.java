package com.etrrat.web.rest;

import com.etrrat.service.HamiService;
import com.etrrat.service.dto.HamiDTO;
import com.etrrat.service.dto.HesabDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/payment-type")
public class PaymentTypeController {

    @Autowired
    private HamiService hamiService;

    @GetMapping
    public HesabDTO getPaymentTypes(){
            return hamiService.getPaymentType();
    }

}
