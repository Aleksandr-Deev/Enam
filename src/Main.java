import Transport.*;

public class Main {
    public static void main(String[] args) {

        Bus volgaBus = new Bus("ВолгаБус", "Воробей", 4.6, Capacity.MEDIUM);
        Bus hyundai = new Bus("Хендай", "Жук", 4.2, Capacity.EXTRA_SMALL);
        Bus scania = new Bus("Скания", "Орел", 4.8, Capacity.LARGE);
        Bus volvo = new Bus("Вольво", "Бык", 4.1, Capacity.EXTRA_LARGE);

        System.out.println(volgaBus);
        System.out.println(hyundai);
        System.out.println(scania);
        System.out.println(volvo);
        System.out.println();

        System.out.println(volgaBus.pitStop());
        volgaBus.setBestLapTime(15.8);
        System.out.println(volgaBus.bestLapTime());
        volgaBus.setMaxSpeed(37.94);
        System.out.println(volgaBus.maxSpeed());

        Car lada = new Car("Лада", "Веста", 1.6, BodyType.SEDAN);
        Car kia = new Car("Киа", "Селт", 1.4, BodyType.CROSSOVER);
        Car renault= new Car("Рено", "Логан", 1.5, BodyType.SEDAN);
        Car skoda = new Car("Шкода", "Рапид", 1.8, BodyType.STATION_WAGON);

        System.out.println(lada);
        System.out.println(kia);
        System.out.println(renault);
        System.out.println(skoda);
        System.out.println();

        Truck kamaz = new Truck("Камаз", "Пушинка", 9.5 , LoadCapacity.N1);
        Truck dongfeng = new Truck("Донгфен", "Гайка", 9.4, LoadCapacity.N3);
        Truck jac = new Truck("Джак", "Болт", 9.2, LoadCapacity.N2);
        Truck gmc = new Truck("Джмс", "Отвертка", 9.7, LoadCapacity.N3);

        System.out.println(kamaz);
        System.out.println(dongfeng);
        System.out.println(jac);
        System.out.println(gmc);
    }
}