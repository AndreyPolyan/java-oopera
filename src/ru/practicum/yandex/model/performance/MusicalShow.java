package ru.practicum.yandex.model.performance;

import ru.practicum.yandex.model.workers.Actor;
import ru.practicum.yandex.model.workers.Director;
import ru.practicum.yandex.model.workers.Composer;

import java.util.List;

public class MusicalShow extends Show {
    private Composer musicAuthor;
    private String librettoText;

    public MusicalShow(int duration, Director director, List<Actor> listOfActors, String title, Composer musicAuthor, String librettoText) {
        super(duration, director, listOfActors, title);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public MusicalShow(int duration, Director director, String title, Composer musicAuthor, String librettoText) {
        super(duration, director, title);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public Composer getMusicAuthor() {
        return musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public void setMusicAuthor(Composer musicAuthor) {
        this.musicAuthor = musicAuthor;
    }

    public void setLibrettoText(String librettoText) {
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        if (librettoText == null) {
            System.out.println("Либретто не указано");
            return;
        }
        System.out.printf("Либретто постановки: %s\n", librettoText);
    }
}
