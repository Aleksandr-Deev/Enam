package Drivers;

import com.sun.jdi.connect.Transport;

public class Driver<T extends Transport> {

    private final String driverName;
    private final char driverLicense;
    private final int drivingExperience;
    private final T car;

    protected Driver(String driverName,char driverLicense, int drivingExperience, T car) {
        this.driverName = driverName;
        this.driverLicense = driverLicense;
        this.drivingExperience = drivingExperience;
        this.car = car;
    }



    public void Start() {
        System.out.println("Поехали");
    }

    public void Stop() {
        System.out.println("Остановились");
    }

    public void refuelCar() {
        System.out.println("Пора заправиться");
    }

    public String getDriverName() {
        return driverName;
    }

    public char getDriverLicense() {
        return driverLicense;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }
}
