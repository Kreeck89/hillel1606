package lesson10;

public class Parrot extends Animal {
    private String colour;

    public Parrot(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public void voice() {
        System.out.println("Tweet");
    }
}
