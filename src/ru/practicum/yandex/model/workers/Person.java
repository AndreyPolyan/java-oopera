package ru.practicum.yandex.model.workers;

import java.util.Objects;

public class Person {
    private final Gender gender;
    private final String name;
    private final String surname;

    public Person(Gender gender, String name, String surname) {
        this.gender = gender;
        this.name = name;
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return gender == person.gender &&
                Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gender, name, surname);
    }

    @Override
    public String toString() {
        return this.name + " " + this.surname;
    }
}
