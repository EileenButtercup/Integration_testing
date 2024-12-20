package ru.netology.integration_testing.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.integration_testing.systemProfile.DevProfile;
import ru.netology.integration_testing.systemProfile.ProductionProfile;
import ru.netology.integration_testing.systemProfile.SystemProfile;

@Configuration
public class JavaConfiguration {
    @Bean(name = "devProfile")
    @ConditionalOnProperty(prefix = "netology", name = "profile.dev", havingValue = "true", matchIfMissing = true)
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean(name = "prodProfile")
    @ConditionalOnProperty(prefix = "netology", name = "profile.dev", havingValue = "false")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
