package lesson7;

public class PoliceCar extends Car {
    String rank;

    public PoliceCar(String rank) {
        this.rank = rank;
    }

    @Override
    public void drive() {
        System.out.println("I`m policeCard!");
    }
}
