package com.miniuber.passengerservice.repository;

import com.miniuber.passengerservice.entity.Trip;
import com.miniuber.passengerservice.util.TripStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TripRepository extends JpaRepository<Trip, Long> {
    Optional<Trip> findByTripStatusNotAndTripStatusNot(TripStatus a, TripStatus b);
    List<Trip> findByTripStatus(TripStatus tripStatus);
}