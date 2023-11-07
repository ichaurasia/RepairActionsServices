package com.progrexion.repairactionsservices.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication(scanBasePackages = "com.progrexion.repairactionsservices")
public class RepairActionsServicesApplication {
    public static void main(String[] args) {
        log.info("RepairActionsServicesApplication log");
        SpringApplication.run(RepairActionsServicesApplication.class, args);
    }

}
