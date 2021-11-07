package no.skatteetaten.opiz.config;

import no.skatteetaten.opiz.models.Coach;
import no.skatteetaten.opiz.models.implementation.LazyCoach;
import no.skatteetaten.opiz.services.FortuneService;
import no.skatteetaten.opiz.services.implementation.FileFortuneService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@PropertySource({"classpath:resource/logger.properties",
        "classpath:resource/application.properties"})
public class LazyConfig {

    // define bean for our our logger
    @Bean
    public MyLoggerConfig myLoggerConfig(
            @Value("root.logger.level") String rootLoggerLevel,
            @Value("printed.logger.level") String printedLoggerLevel
    ) {
        return new MyLoggerConfig(rootLoggerLevel, printedLoggerLevel);
    }

    // define bean for our fortune service
    @Bean
    public FortuneService fortuneService() {
        return new FileFortuneService();
    }

    // define bean for our lazy coach AND inject dependency
    @Bean
    public Coach lazyCoach() {
        return new LazyCoach(fortuneService());
    }

}
