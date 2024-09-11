package org.example.eurekabankservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaBankServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaBankServiceApplication.class, args);
    }

}
