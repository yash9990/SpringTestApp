package com.example.swag01.demo.controller;

import com.example.swag01.demo.dtos.Mandate;
import com.example.swag01.demo.service.MandateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/mandate")
public class MandateController {

    @Autowired
    MandateService service;

    private  final Logger log = LoggerFactory.getLogger(MandateController.class);

    @RequestMapping("/list")
    public List<Mandate> list(){
        log.debug("Inside Controller");
        List<Mandate> mandates = new ArrayList<>();
        mandates = service.listOfMandates();
        return mandates;
    }


}

