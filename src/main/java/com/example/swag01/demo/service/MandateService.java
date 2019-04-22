package com.example.swag01.demo.service;

import com.example.swag01.demo.controller.MandateController;
import com.example.swag01.demo.dtos.Mandate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MandateService {

    private  final Logger log = LoggerFactory.getLogger(MandateService.class);

    public List<Mandate> listOfMandates(){
        log.debug("Inside Service");
        List<Mandate> mandates = new ArrayList<>();

        Mandate m1 = new Mandate();
        m1.setCAccno("111101111");
        m1.setDAccno("65465");
        m1.setMid(1l);
        m1.setNoti(true);

        Mandate m2 = new Mandate();
        m2.setCAccno("222202222");
        m2.setDAccno("65465");
        m2.setMid(2l);
        m2.setNoti(true);

        Mandate m3 = new Mandate();
        m3.setCAccno("333303333");
        m3.setDAccno("65465");
        m3.setMid(3l);
        m3.setNoti(true);

        mandates.add(m1);
        mandates.add(m2);
        mandates.add(m3);

        return mandates;
    }

}
