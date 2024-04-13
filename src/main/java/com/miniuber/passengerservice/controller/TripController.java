package com.miniuber.passengerservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/passenger")
public class TripController {
    @PostMapping
    ResponseEntity<?> createTrip() {
        return null;
    }

    @GetMapping
    ResponseEntity<?> getCurrentTrip() {
        return null;
    }

    @GetMapping
    ResponseEntity<?> getTripHistory() {
        return null;
    }
}
