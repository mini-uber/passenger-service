CREATE TABLE trip
(
    id                   BIGINT       NOT NULL,
    passenger_id         BIGINT       NULL,
    driver_id            BIGINT       NULL,
    trip_status          ENUM('REQUESTED', 'ACCEPTED', 'ONGOING', 'COMPLETED', 'CANCELLED')     NULL,
    destination_location VARCHAR(255) NULL,
    pickup_location      VARCHAR(255) NULL,
    created_at           datetime     NULL,
    updated_at           datetime     NULL,
    CONSTRAINT pk_trip PRIMARY KEY (id)
);