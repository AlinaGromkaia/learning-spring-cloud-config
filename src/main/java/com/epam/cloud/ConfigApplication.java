package com.epam.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigApplication {
    public static void main(String[] arguments) {
        SpringApplication.run(ConfigApplication.class, arguments);
    }
}
