package com.wilson.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @Value("${spring.profiles.active}")
    private String profileActive;

    @RequestMapping(value = "/healthcheck", method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String healthCheck() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("group name: test-1027-zhang");
        stringBuilder.append("\nproject name: test-1030-gradle");
        stringBuilder.append("\nproject description: ");
        stringBuilder.append("\nenv: " + profileActive);
        return stringBuilder.toString();
    }

}
