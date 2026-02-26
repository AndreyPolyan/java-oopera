package ru.practicum.yandex.model.workers;

import java.util.Objects;

public class Director extends Person {

    private int numberOfShows;

    public Director(Gender gender, String name, String surname) {
        super(gender, name, surname);
        this.numberOfShows = 0;
    }

    public Director(Gender gender, String name, String surname, int numberOfShows) {
        super(gender, name, surname);
        this.numberOfShows = numberOfShows;
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }

    public void setNumberOfShows(int numberOfShows) {
        this.numberOfShows = numberOfShows;
    }

    public void incrementNumberOfShows() {
        this.numberOfShows++;
    }

    public void decrementNumberOfShows() {
        if (numberOfShows > 0) {
            this.numberOfShows--;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Director director = (Director) o;
        return numberOfShows == director.numberOfShows;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfShows);
    }

    @Override
    public String toString() {
        return "Постановщик{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", gender=" + getGender() +
                ", numberOfShows=" + getNumberOfShows() +
                '}';
    }
}