package lesson8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Human human = new Human();
        human.test(); // не будет доступен метод с private

        Human bob = new Human("Bob", "Bobov");
//        bob.name = "asas"; // к private переменным нет прямого доступа
        System.out.println(bob.getName());
        bob.setName("David");
        System.out.println(bob.getName());

        System.out.println(Constants.KIEV_CITY);
        System.out.println(Human.getCounter());
//        Human.setCounter(1000);

        Animal animal = new Animal();
        Animal dog = new Animal("Charly");
        Animal cat = new Animal("Barsik", "Persian", 1);

        dog.setAge(5);

        Animal dog2 = new Animal("Charly");
        dog2.setAge(5);

        System.out.println(dog.equals(dog2));
        System.out.println(dog.equals(cat));

        if (dog.equals(dog2)) {
            System.out.println(dog.toString());
        }
    }

    private static void registration() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String surname = scanner.next();

        Human human = new Human(name, surname);
//        Human human = new Human();
//        human.setName(name);
//        human.setSurname(surname);
    }
}
