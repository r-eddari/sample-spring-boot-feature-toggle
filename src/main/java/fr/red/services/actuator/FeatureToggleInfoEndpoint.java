package fr.red.services.actuator;

import fr.red.services.utils.FeatureToogleUtils;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Endpoint(id = "feature-toggles")
public class FeatureToggleInfoEndpoint {

    private final FeatureToogleUtils featureToogleUtils;

    public FeatureToggleInfoEndpoint(FeatureToogleUtils featureToogleUtils) {
        this.featureToogleUtils = featureToogleUtils;
    }

    @ReadOperation
    public Map<String, Boolean> featureToggles(){
        return featureToogleUtils.getToggles();
    }
}
