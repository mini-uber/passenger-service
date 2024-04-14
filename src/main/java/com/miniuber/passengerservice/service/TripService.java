package com.miniuber.passengerservice.service;

import com.miniuber.passengerservice.dto.DriverRequest;
import com.miniuber.passengerservice.dto.LocationDto;
import com.miniuber.passengerservice.dto.TripRequest;
import com.miniuber.passengerservice.dto.TripResponse;

import java.util.List;

public interface TripService {
    TripResponse createTrip(TripRequest request);
    TripResponse getCurrentTrip(Long userId);
    List<LocationDto> getTripLocations();
    void requestDriver(DriverRequest request);
}
