package com.ad.app.service;

import com.ad.app.properties.PersonProperties;
import com.ad.app.properties.AutoMobileProperties;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class PropertiesService {

    private final PersonProperties personProperties;
    private final AutoMobileProperties autoMobileProperties;

    public PropertiesService(PersonProperties personProperties, AutoMobileProperties autoMobileProperties) {
        this.personProperties = personProperties;
        this.autoMobileProperties = autoMobileProperties;
    }

    public PersonProperties getPersonProperties() {
        return this.personProperties;
    }

    public AutoMobileProperties getAutoMobileProperties() {
        return this.autoMobileProperties;
    }
}
