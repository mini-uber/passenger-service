package com.miniuber.passengerservice.entity;

import com.miniuber.passengerservice.util.TripStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.sql.Timestamp;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Trip {
    @Id
    private Long id;
    private Long passengerId;
    private Long driverId;
    private TripStatus tripStatus;
    private String destinationLocation;
    private String pickupLocation;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
