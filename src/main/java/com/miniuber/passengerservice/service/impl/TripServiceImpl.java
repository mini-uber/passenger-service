package com.miniuber.passengerservice.service.impl;

import com.miniuber.passengerservice.dto.LocationDto;
import com.miniuber.passengerservice.dto.TripRequest;
import com.miniuber.passengerservice.dto.TripResponse;
import com.miniuber.passengerservice.entity.Trip;
import com.miniuber.passengerservice.mapper.TripMapper;
import com.miniuber.passengerservice.repository.TripRepository;
import com.miniuber.passengerservice.service.TripService;
import com.miniuber.passengerservice.util.TripStatus;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TripServiceImpl implements TripService {
    private final TripRepository tripRepository;

    @Override
    public TripResponse createTrip(TripRequest request) {
        Trip trip = TripMapper.tripRequestToTrip(request);
        trip.setTripStatus(TripStatus.REQUESTED);
        trip = tripRepository.save(trip);
        return TripMapper.tripToTripResponse(trip);
    }

    @Override
    public TripResponse getCurrentTrip(Long userId) {
        return TripMapper.tripToTripResponse(
                tripRepository
                        .findByTripStatusNotAndTripStatusNot(TripStatus.CANCELLED, TripStatus.COMPLETED)
                        .orElseThrow(EntityNotFoundException::new)
        );
    }

    @Override
    public List<LocationDto> getTripLocations() {
        return tripRepository
                .findByTripStatus(TripStatus.INITIAL)
                .stream()
                .map(trip -> new LocationDto(trip.getPickupLat(), trip.getPickupLon()))
                .toList();
    }

}
