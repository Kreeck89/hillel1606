package lesson10;

import java.util.Objects;

public class FireMan extends Human {
    private int weight;

    public FireMan() {
    }

    public FireMan(String name, String surname, int age) {
        super(name, surname, age);
    }

    public FireMan(String name, String surname, int age, int weight) {
        super(name, surname, age);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FireMan fireMan = (FireMan) o;
        return weight == fireMan.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight);
    }

//    @Override
//    public String toString() {
//        return "FireMan{" +
//                "weight=" + weight +
//                '}';
//    }

    @Override
    public void work() {
        System.out.println("I'm fireman.");
    }

    @Override
    public void drive() {
        System.out.println("We have a work firetruck");
    }

    @Override
    public void relax(int days) {

    }
}
