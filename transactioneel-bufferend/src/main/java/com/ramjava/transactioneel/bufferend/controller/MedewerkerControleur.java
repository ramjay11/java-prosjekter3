package com.ramjava.transactioneel.bufferend.controller;

import com.ramjava.transactioneel.bufferend.service.MedewerkersDienst;
import com.ramjava.transactioneel.bufferend.valueobject.MedewerkerRequestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedewerkerControleur {

    @Autowired
    private MedewerkersDienst medewerkersDienst;
    @PostMapping("/medewerker")
    public String saveMedwerker(@RequestBody MedewerkerRequestVO medewerkerRequestVO) {
        return medewerkersDienst.saveMedewerker(medewerkerRequestVO);
    }
}
