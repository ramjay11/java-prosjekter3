package com.ramjava.transactioneel.bufferend.service;

import com.ramjava.transactioneel.bufferend.entity.Afdeling;
import com.ramjava.transactioneel.bufferend.entity.Medewerker;
import com.ramjava.transactioneel.bufferend.repository.AfdelingsRepo;
import com.ramjava.transactioneel.bufferend.repository.MedewerkersRepo;
import com.ramjava.transactioneel.bufferend.valueobject.MedewerkerRequestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MedewerkersDienst {
    @Autowired
    private MedewerkersRepo medewerkersRepo;
    @Autowired
    private AfdelingsRepo afdelingsRepo;
    // If there are any exceptions, @Transactional will roll backed on both medewerker/afdeling tables,
    // otherwise, commit if successful
    @Transactional
    public String saveMedewerker(MedewerkerRequestVO medewerkerRequestVO) {
        // Receive info from request vo
        var afdeling = new Afdeling();
        afdeling.setDepName(medewerkerRequestVO.getDepName());
        afdeling.setDepCode(medewerkerRequestVO.getDepName());
        Long depId = afdelingsRepo.save(afdeling).getDepId();
        // Set depId to medewerker object
        var medewerker = new Medewerker();
        //Medewerker medewerker1 = null; // Will throw NullPointerException
        medewerker.setEmpName(medewerkerRequestVO.getEmpName());
        medewerker.setEmail(medewerkerRequestVO.getEmail());
        medewerker.setDepId(depId);
        medewerkersRepo.save(medewerker);
        //medewerkersRepo.save(medewerker1);
        return "Medewerker is saved with Emp ID : " + medewerker.getEmpId();
    }
}
