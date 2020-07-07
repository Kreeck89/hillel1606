package lesson7;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.name);
        System.out.println(car.number);
        System.out.println(car.age);

        car.name = "myLoveCar";
        car.number = "AA0001II";
        System.out.println(car.name);
        System.out.println(car.number);

        Car alexCar = new Car("Alex", "VI0002AA", 0);
        System.out.println(alexCar.number);

        Car cardWithNumber = new Car("II0003II");

        Car yushkoCar = new Car("Camry", "II0004II", "Yushko Alexander");
        System.out.println(yushkoCar);
        System.out.println(yushkoCar.getOwner());

        yushkoCar.setOwner("Bob");
        System.out.println(yushkoCar.getOwner());

        yushkoCar.setOwner("Olga Vasko");
        yushkoCar.drive();
        System.out.println(yushkoCar.getOwner());

        PoliceCar policeCar = new PoliceCar("233");
        System.out.println(policeCar);
        policeCar.drive();
    }
}
