package lesson9;

public class Cat extends Animal {
    private String breed;

    public Cat(String name, String type, int age) {
        super(name, type, age);
    }

    public Cat(String name, String type) {
        super(name, type);
    }

    public Cat(String name, String type, String breed) {
        super(name, type);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
