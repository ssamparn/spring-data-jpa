package com.spring.data.jpa.sdjpajdbc.config;

import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("clean")
@Configuration
public class ClearDbContextConfig {

    @Bean
    public FlywayMigrationStrategy clean() {
        return flyway -> {
            flyway.clean();
            flyway.migrate();
        };
    }
}
