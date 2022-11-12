package Transport;

public class Bus extends Transport implements Competing, com.sun.jdi.connect.Transport {

    public Capacity capacity;

    public Bus(String brand, String model, double engineCapacity, Capacity capacity) {
        super(brand, model, engineCapacity);
        this.capacity = capacity;
    }

    @Override
    public void printType() {
        if (capacity != null) {
            System.out.println(this.capacity);
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
