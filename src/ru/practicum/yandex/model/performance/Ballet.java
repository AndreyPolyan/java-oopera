package ru.practicum.yandex.model.performance;

import ru.practicum.yandex.model.workers.Actor;
import ru.practicum.yandex.model.workers.Choreographer;
import ru.practicum.yandex.model.workers.Composer;
import ru.practicum.yandex.model.workers.Director;

import java.util.List;

public class Ballet extends MusicalShow {
    private Choreographer choreographer;

    public Ballet(int duration, Director director, String title, Composer musicAuthor,
                  String librettoText, Choreographer choreographer) {
        super(duration, director, title, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public Ballet(int duration, Director director, List<Actor> listOfActors,
                  String title, Composer musicAuthor, String librettoText, Choreographer choreographer) {
        this(duration, director, title, musicAuthor, librettoText, choreographer);
        this.setListOfActors(listOfActors);
    }



    public Choreographer getChoreographer() {
        return choreographer;
    }
}
