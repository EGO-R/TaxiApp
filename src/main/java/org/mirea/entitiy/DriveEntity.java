package org.mirea.entitiy;

import java.time.LocalDateTime;

public class DriveEntity {
    private Long id;
    private DriverEntity driverEntity;
    private PassengerEntity passengerEntity;
    private String departureLocation;
    private String arrivalLocation;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;


}
