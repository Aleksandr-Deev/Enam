package Transport;

public class Truck extends Transport implements Competing, com.sun.jdi.connect.Transport {

    public LoadCapacity loadCapacity;

    public Truck(String brand, String model, double engineCapacity, LoadCapacity loadCapacity) {
        super(brand, model, engineCapacity);
        this.loadCapacity =loadCapacity;
    }

    @Override
    public void printType() {
        if (loadCapacity != null) {
            System.out.println(this.loadCapacity);
        } else {
            System.out.println("Информации недостаточно");
        }
    }

    @Override
    public String pitStop() {
        return "Заезжаю на Пит-Стор";
    }

    @Override
    public String bestLapTime() {
        return "Лучшее время круга - " + getBestLapTime();
    }

    @Override
    public String maxSpeed() {
        return "Максимальная скорость - " + getMaxSpeed();
    }

    @Override
    public String name() {
        return null;
    }
}
