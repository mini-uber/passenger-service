package com.miniuber.passengerservice.entity;

import com.miniuber.passengerservice.util.TripStatus;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.sql.Timestamp;
import java.util.Objects;

@Builder
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(
        indexes = {
                @Index(name = "destinationIndex", columnList = "destinationLat, destinationLon"),
                @Index(name = "pickupIndex", columnList = "pickupLat, pickupLon"),
                @Index(name = "tripStatusIndex", columnList = "tripStatus")
        }
)
public class Trip {
    @Id
    @GeneratedValue
    private Long id;
    private Long passengerId;
    private Long driverId;
    private TripStatus tripStatus;
    private Double destinationLat;
    private Double destinationLon;
    private Double pickupLat;
    private Double pickupLon;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Trip trip = (Trip) o;
        return getId() != null && Objects.equals(getId(), trip.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
