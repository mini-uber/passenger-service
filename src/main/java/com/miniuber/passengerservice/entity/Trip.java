package com.miniuber.passengerservice.entity;

import com.miniuber.passengerservice.util.TripStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Trip {

    @Id
    @GeneratedValue
    private Long id;

    private Long passengerId;
    private Long driverId;

    private TripStatus tripStatus;
    private String destinationLocation;
    private String pickupLocation;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
