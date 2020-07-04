package fr.red.services.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@ConfigurationProperties("feature")
public class FeatureToogleUtils {
    private Map<String, Boolean> toggles = new HashMap<>();

    public Map<String, Boolean> getToggles() {
        return toggles;
    }

    public boolean isEmployesFromWebServiceEnabled(){
        return toggles.getOrDefault("employesFromWebService", false);
    }
}
