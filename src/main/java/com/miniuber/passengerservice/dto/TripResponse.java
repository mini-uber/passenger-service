package com.miniuber.passengerservice.dto;

import com.miniuber.passengerservice.util.TripStatus;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Builder
@Getter
@Setter
public class TripResponse {
    private Long passengerId;
    private Long driverId;
    private TripStatus tripStatus;
    private LocationDto destinationLocationDto;
    private LocationDto pickupLocationDto;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}