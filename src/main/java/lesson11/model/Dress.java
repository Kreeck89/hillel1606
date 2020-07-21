package lesson11.model;

import java.util.Objects;

public class Dress extends Clothes {
    private boolean zipper;

    public Dress() {
    }

    public Dress(String type, String name, String country, double price,
                 int size, boolean forMan, boolean forWoman, boolean zipper) {
        super(type, name, country, price, size, forMan, forWoman);
        this.zipper = zipper;
    }

    public boolean isZipper() {
        return zipper;
    }

    public void setZipper(boolean zipper) {
        this.zipper = zipper;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dress dress = (Dress) o;
        return zipper == dress.zipper;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), zipper);
    }

    @Override
    public void about() {

    }
}
