package com.ad.app.controller;

import com.ad.app.config.PersonProperties;
import com.ad.app.service.PropertiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/spring-boot-properties")
public class PropertiesAppController {

    @Autowired
    private PropertiesService propertiesService;

    @GetMapping(value = "/")
    public ResponseEntity<PersonProperties> getPersonProperties() {
        return ResponseEntity.ok(propertiesService.getPersonProperties());
    }
}
