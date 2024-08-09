package org.acmeware;

import org.acmeware.util.CustomEventPublisher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.logging.Logger;

@SpringBootApplication
@EnableCaching
@EnableEurekaClient
public class AppointmentServiceApplication {
    private static final Logger logger =
            Logger.getLogger(AppointmentServiceApplication.class.getName());
    private static CustomEventPublisher customEventPublisher;

    public static void main(String[] args) {
        SpringApplication.run(AppointmentServiceApplication.class, args);
        logger.info("Application started...");
    }

    private static void publishAppStartEvent() {
        customEventPublisher = new CustomEventPublisher();
        customEventPublisher.publishCustomEvent("Application started...");
    }

}
