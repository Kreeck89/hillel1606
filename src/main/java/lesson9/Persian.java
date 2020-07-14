package lesson9;

public class Persian extends Cat {
    private String color;

    public Persian(String name, String type) {
        super(name, type);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
