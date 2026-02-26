package ru.practicum.yandex.model.workers;

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
    public String toString() {
        return "Постановщик{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", gender=" + getGender() +
                ", numberOfShows=" + getNumberOfShows() +
                '}';
    }
}