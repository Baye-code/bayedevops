package com.bayedevops.config;

import com.bayedevops.backend.service.EmailService;
import com.bayedevops.backend.service.MockEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile("dev")
@PropertySource("file:///C:/Users/bayes/Documents/IntelliJ-Workspace/bayedevops/.external/application-dev.properties")
public class DevelopmentConfig {

    @Bean
    public EmailService emailService() {
        return new MockEmailService();
    }
}