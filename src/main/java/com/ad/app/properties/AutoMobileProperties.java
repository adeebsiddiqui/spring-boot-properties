package com.ad.app.properties;

import com.ad.app.config.YmlPropertySourceFactory;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Map;

@Data
@Component
@ConfigurationProperties("automobile")
@PropertySource(value = "classpath:automobile-specifications.yml", factory = YmlPropertySourceFactory.class)
public class AutoMobileProperties {
    private Map<String, String> specs;
}
