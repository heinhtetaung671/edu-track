package com.jdc.edu.config;

import com.jdc.edu.domain.BaseRepositoryImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaAuditing
@PropertySource("classpath:/domain.properties")
@EnableJpaRepositories(repositoryBaseClass = BaseRepositoryImpl.class)
public class EduTrackDomainConfiguration {
}
