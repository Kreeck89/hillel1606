package lesson3;

import java.util.Objects;

/**
 * У дааного объекта есть 4 поля характеристик.
 * При создании экземпляра данного класса данные характеристики можно задавать
 */
public class User {
    String name;
    String surname;
    int age;
    String city;

    /**
     * @param o Так указывается любой входящий объект для сравнений
     * @return boolean(true/false) равны/не равны сравневаемые объекты
     * Данный метод генерируется IDEA автоматически
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name) &&
                Objects.equals(surname, user.surname);
    }

    /**
     * @return int значение hash объекта
     * Пока необходимо запомнить, что данный метод переопределяется всегда вместе с equals методом
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }
}
