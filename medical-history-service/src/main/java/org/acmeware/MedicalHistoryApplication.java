package org.acmeware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MedicalHistoryApplication {
    public static void main(String[] args) {
        SpringApplication.run(MedicalHistoryApplication.class, args);
    }
}
