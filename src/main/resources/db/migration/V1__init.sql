CREATE TABLE trip
(
    id              BIGINT   NOT NULL,
    passenger_id    BIGINT   NULL,
    driver_id       BIGINT   NULL,
    trip_status     SMALLINT NULL,
    destination_lat DOUBLE   NULL,
    destination_lon DOUBLE   NULL,
    pickup_lat      DOUBLE   NULL,
    pickup_lon      DOUBLE   NULL,
    created_at      datetime NULL,
    updated_at      datetime NULL,
    CONSTRAINT pk_trip PRIMARY KEY (id)
);