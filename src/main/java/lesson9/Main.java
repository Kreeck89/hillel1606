package lesson9;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.getAge();
        animal.getName();
        animal.getType();

        Cat cat = new Cat("Barsik", "unknown", 1);
        cat.getBreed();
        cat.getAge();
        cat.getName();
        cat.getType();

        Persian persian = new Persian("Boris", "persian");
        persian.getColor();
        persian.getAge();
        persian.getColor();
        persian.getName();
        persian.getType();
        persian.getBreed();

        British british = new British();
        british.getAge();
        british.getName();
        british.getType();

//        animal.say();
//        cat.say();
//        persian.say();
//        british.say();

        Dog dog = new Dog();
        catSay(cat);
        catSay(persian);
        dogSay(dog);


//        say(animal);
//        say(cat);
//        say(persian);
//        say(british);
        say(dog);

        cat.getBreed();
        Animal animalFromCat = cat;
//        animalFromCat.getBreed(); //Произошло не явное преобразование и этот метод уже не вызвать!

        Cat catFromAnimal = (Cat) animal;
        catFromAnimal.getBreed();
    }

    private static void catSay(Cat cat) {
        cat.say();
    }

    private static void dogSay(Dog dog) {
        dog.say();
    }

    private static void say(Animal animal) {
        if (animal instanceof Cat) {
            ((Cat) animal).getBreed();
        }
        if (animal instanceof Dog) {
            ((Dog) animal).run();
        }
        if (animal instanceof Persian) {
            Persian persian = ((Persian) animal);
            persian.getColor();
            persian.getBreed();
        }
    }
}
