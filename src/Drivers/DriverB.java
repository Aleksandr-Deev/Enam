package Drivers;

import Transport.Car;

public class DriverB extends Driver<Car>{
    public DriverB(String driverName, char driverLicense, int drivingExperience, Car car) {
        super(driverName, 'B', drivingExperience, car);
    }
}
