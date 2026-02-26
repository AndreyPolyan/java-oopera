package ru.practicum.yandex.model.performance;

import ru.practicum.yandex.model.workers.Actor;
import ru.practicum.yandex.model.workers.Composer;
import ru.practicum.yandex.model.workers.Director;

import java.util.List;

public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(int duration, Director director, List<Actor> listOfActors, String title, Composer musicAuthor, String librettoText, int choirSize) {
        super(duration, director, listOfActors, title, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public Opera(int duration, Director director, String title, Composer musicAuthor, String librettoText, int choirSize) {
        super(duration, director, title, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }
}
