package lesson8;

import java.util.Objects;

public class Human {
    private static int counter = 0;
    private String name;
    private String surname;

    public Human() {
        counter++;
    }

    public Human(String name, String surname) {
        counter++;
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public static int getCounter() {
        return counter;
    }

//    public static void setCounter(int counter) {
//        Human.counter = counter;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public void test() {
        System.out.println("protected test");
    }
}