package com.ad.app.service;

import com.ad.app.config.PersonProperties;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class PropertiesService {

    private final PersonProperties personProperties;

    public PropertiesService(PersonProperties personProperties) {
        this.personProperties = personProperties;
    }

    public PersonProperties getPersonProperties() {
        return this.personProperties;
    }
}
