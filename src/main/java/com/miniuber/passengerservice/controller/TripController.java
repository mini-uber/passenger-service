package com.miniuber.passengerservice.controller;

import com.miniuber.passengerservice.dto.DriverRequest;
import com.miniuber.passengerservice.dto.LocationDto;
import com.miniuber.passengerservice.dto.TripRequest;
import com.miniuber.passengerservice.dto.TripResponse;
import com.miniuber.passengerservice.service.TripService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/passengers")
public class TripController {
    private final TripService service;

    @PostMapping("trip")
    ResponseEntity<TripResponse> createTrip(@RequestBody TripRequest request) {
        return ResponseEntity.ok(service.createTrip(request));
    }

    @PostMapping("request-driver")
    ResponseEntity<Void> requestDriver(@RequestBody DriverRequest request) {
        service.requestDriver(request);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("locations")
    ResponseEntity<List<LocationDto>> getTripLocations() {
        return ResponseEntity.ok(service.getTripLocations());
    }


    @GetMapping
    ResponseEntity<TripResponse> getCurrentTrip(@RequestParam Long userId) {
        return ResponseEntity.ok(service.getCurrentTrip(userId));
    }
}
