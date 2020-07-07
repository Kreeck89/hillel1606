package lesson7;

public class Car {
    String name;
    String number;
    int age;
    private String owner;

    public Car(String name, String number, String owner) {
        this.name = "Toyota " + name;
        this.number = number;
        this.owner = owner;
    }

    public Car(String name, String number, int age) {
        this(name, age);
        this.number = number;
    }

    public Car(String number, int age, String name) {
        this(name, age);
        this.number = number;
    }

    //wrong constructor
//    public Car(int carAge, String carNumber, String carName) {
//        age = carAge;
//        number = carNumber;
//        name = carName;
//    }

    public Car(String number) {
        this.number = number;
    }

    public Car(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Car(int age) {
        this.age = age;
    }

    public Car() {
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        if (owner != null && owner.length() > 5) {
            this.owner = owner;
        }
    }

    public void drive() {
        System.out.println("i'm here");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", age=" + age +
                '}';
    }
}
