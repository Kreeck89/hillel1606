package lesson11.model;

import java.util.Objects;

public class Shirt extends Clothes {
    private boolean button;

    public Shirt() {
    }

    public Shirt(String type, String name, String country, double price,
                 int size, boolean forMan, boolean forWoman, boolean button) {
        super(type, name, country, price, size, forMan, forWoman);
        this.button = button;
    }

    public boolean isButton() {
        return button;
    }

    public void setButton(boolean button) {
        this.button = button;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Shirt shirt = (Shirt) o;
        return button == shirt.button;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), button);
    }

    @Override
    public void about() {

    }
}
