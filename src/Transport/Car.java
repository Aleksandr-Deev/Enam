package Transport;

public class Car extends Transport implements Competing, com.sun.jdi.connect.Transport {

    public BodyType bodyType;

    public Car(String brand, String model, double engineCapacity, BodyType bodyType) {
        super(brand, model, engineCapacity);
        this.bodyType = bodyType;
    }

    @Override
    public void printType() {
        if (bodyType != null) {
            System.out.println(this.bodyType);
        } else {
            System.out.println("Информации недостаточно");
        }
    }

    @Override
    public String pitStop() {
        return null;
    }

    @Override
    public String bestLapTime() {
        return null;
    }

    @Override
    public String maxSpeed() {
        return null;
    }

    @Override
    public String name() {
        return null;
    }
}
