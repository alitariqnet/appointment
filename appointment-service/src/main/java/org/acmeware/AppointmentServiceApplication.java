package org.acmeware;

import org.acmeware.util.CustomEventPublisher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableCaching
@EnableEurekaClient
public class AppointmentServiceApplication {
    private static CustomEventPublisher customEventPublisher;

    public static void main(String[] args) {
        SpringApplication.run(AppointmentServiceApplication.class, args);
    }

    private static void publishAppStartEvent() {
        customEventPublisher = new CustomEventPublisher();
        customEventPublisher.publishCustomEvent("Application started...");
    }

}
