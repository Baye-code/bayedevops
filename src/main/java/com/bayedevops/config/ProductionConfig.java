package com.bayedevops.config;

import com.bayedevops.backend.service.EmailService;
import com.bayedevops.backend.service.SmtpEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile("prod")
@PropertySource("file:///C:/Users/bayes/Documents/IntelliJ-Workspace/bayedevops/.external/application-prod.properties")
public class ProductionConfig {

    @Bean
    public EmailService emailService() {
        return new SmtpEmailService();
    }
}