package org.acmeware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.logging.LogManager;
import java.util.logging.Logger;

@EnableEurekaClient
@EnableCaching
@EnableScheduling
@SpringBootApplication
public class NotificationServiceApplication {
    private static final Logger log = LogManager.getLogManager().getLogger("NotificationServiceApplication");
    public static void main(String[] args) {
        SpringApplication.run(NotificationServiceApplication.class, args);
        log.info("Application started...");
    }
}

