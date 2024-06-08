package com.jdc.edu.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing
@PropertySource("classpath:/domain.properties")
public class EduTrackDomainConfiguration {

}
