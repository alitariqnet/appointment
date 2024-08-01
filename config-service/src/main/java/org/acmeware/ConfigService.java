package org.acmeware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigService {
    public static void main(String[] args) {
        SpringApplication.run(ConfigService.class);
    }
}
