package com.miniuber.passengerservice.controller;

import com.miniuber.passengerservice.dto.DriverRequest;
import com.miniuber.passengerservice.dto.TripRequest;
import com.miniuber.passengerservice.dto.TripResponse;
import com.miniuber.passengerservice.service.TripService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/passenger")
public class TripController {
    private final TripService service;

    @PostMapping
    ResponseEntity<TripResponse> createTrip(@RequestBody TripRequest request) {
        return ResponseEntity.ok(service.createTrip(request));
    }

    @PostMapping("request-driver")
    ResponseEntity<?> requestDriver(@RequestBody DriverRequest request) {
        return null;
    }

    @GetMapping
    ResponseEntity<TripResponse> getCurrentTrip(@RequestParam Long userId) {
        return ResponseEntity.ok(service.getCurrentTrip(userId));
    }
}
