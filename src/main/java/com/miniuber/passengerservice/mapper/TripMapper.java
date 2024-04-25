package com.miniuber.passengerservice.mapper;

import com.miniuber.passengerservice.dto.TripRequest;
import com.miniuber.passengerservice.dto.TripResponse;
import com.miniuber.passengerservice.entity.Trip;
import com.miniuber.passengerservice.dto.LocationDto;

public class TripMapper {
    public static TripResponse tripToTripResponse(Trip trip) {
        return TripResponse
                .builder()
                .passengerId(trip.getPassengerId())
                .driverId(trip.getDriverId())
                .tripStatus(trip.getTripStatus())
                .destinationLocationDto(new LocationDto(trip.getDestinationLat(), trip.getDestinationLon()))
                .pickupLocationDto(new LocationDto(trip.getPickupLat(), trip.getPickupLon()))
                .createdAt(trip.getCreatedAt())
                .updatedAt(trip.getUpdatedAt())
                .build();
    }

    public static Trip tripRequestToTrip(TripRequest request) {
        return Trip
                .builder()
                .passengerId(request.getPassengerId())
                .pickupLat(request.getPickupLocation().getLat())
                .pickupLon(request.getPickupLocation().getLon())
                .destinationLat(request.getDestinationLocation().getLat())
                .destinationLon(request.getDestinationLocation().getLon())
                .build();
    }


}
