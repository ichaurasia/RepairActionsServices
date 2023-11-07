package com.progrexion.repairactionsservices.web.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("v1")
public class RepairActionsServicesController {

    /**
     * This is here for development purposes and making sure environment is setup and responding
     *
     * @return "ping" with an HTTP-200
     */
    @GetMapping("/health_check")
    public ResponseEntity<String> getHealthStatus(@RequestParam Optional<String> throwError) throws Exception {
        if (throwError.isPresent()) {
            throw new Exception("Error DEV-001 - ping message error");
        }
        return ResponseEntity.status(HttpStatus.OK).body("Good.");
    }

}
