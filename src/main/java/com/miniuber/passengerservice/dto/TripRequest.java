package com.miniuber.passengerservice.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class TripRequest {
    private Long passengerId;
    private LocationDto destinationLocationDto;
    private LocationDto pickupLocationDto;
}
