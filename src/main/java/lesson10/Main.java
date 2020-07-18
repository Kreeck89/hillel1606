package lesson10;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.defaultMove();

        Cat cat = new Cat();
        cat.defaultMove();
//        cat.catMove();

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        Parrot parrot = new Parrot("Black");
        parrot.setColour("Red");

        Zoo zoo = new Zoo();
        Cat[] cats = {cat, cat1, cat2};
        zoo.setCats(cats);
        zoo.setParrot(parrot);

        Dog dog = new Dog();
        dog.defaultMove();

        parrot.voice();
        dog.voice();
        cat.voice();

//        Action action = new Action();// Создание интерфейсов НЕВОЗМОЖНО!

        Action action = new PoliceMan();

//        Human human = new Human();
//        human.work();

        PoliceMan policeMan = new PoliceMan();
        policeMan.work();
        policeMan.relax();

        FireMan fireMan = new FireMan();
        fireMan.work();
    }
}
