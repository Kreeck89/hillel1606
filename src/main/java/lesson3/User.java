package lesson3;

import java.util.Objects;

public class User {
    String name;
    String surname;
    int age;
    String city;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name) &&
                Objects.equals(surname, user.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }
}
