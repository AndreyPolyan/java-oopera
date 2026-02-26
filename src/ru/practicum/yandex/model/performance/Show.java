package ru.practicum.yandex.model.performance;

import ru.practicum.yandex.model.workers.Actor;
import ru.practicum.yandex.model.workers.Director;

import java.util.ArrayList;
import java.util.List;

public class Show {
    private int durationMin;
    private Director director;
    private List<Actor> listOfActors;
    private String title;

    public Show(int durationMin, Director director, List<Actor> listOfActors, String title) {
        this.durationMin = durationMin;

        this.director = director;
        if (director != null) {
            director.incrementNumberOfShows();
        }

        this.title = title;
        this.listOfActors = (listOfActors == null) ? new ArrayList<Actor>() : new ArrayList<Actor>(listOfActors);
    }

    public Show(int durationMin, Director director, String title) {
        this(durationMin, director, null, title);
    }

    public void printActors() {
        if (listOfActors == null || listOfActors.isEmpty()) {
            System.out.println("Список актеров для постановки не указан");
            return;
        }

        System.out.println("Список актеров постановки:");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
            System.out.println("-".repeat(10));
        }
    }

    public void addActor(Actor newActor) {
        if (newActor == null) {
            System.out.println("Нельзя добавить null-актера.");
            return;
        }
        if (listOfActors == null) {
            listOfActors = new ArrayList<>();
        }

        if (listOfActors.contains(newActor)) {
            System.out.println("Данный актер уже участвует в постановке:\n" + newActor);
            return;
        }

        listOfActors.add(newActor);
        System.out.println("Актер успешно добавлен:\n" + newActor);
    }

    public void replaceActor(Actor newActor, String replaceForActorSurname) {
        if (newActor == null) {
            System.out.println("Нельзя заменить на null-актера.");
            return;
        }
        if (listOfActors == null || listOfActors.isEmpty()) {
            System.out.println("В постановке на данный момент нет актеров.");
            return;
        }

        for (int i = 0; i < listOfActors.size(); i++) {
            Actor checkActor = listOfActors.get(i);
            if (checkActor != null
                    && checkActor.getSurname() != null
                    && checkActor.getSurname().equals(replaceForActorSurname)) {

                listOfActors.set(i, newActor);
                System.out.println("Актер успешно заменен.");
                System.out.println(checkActor + " -> " + newActor);
                return;
            }
        }

        System.out.println("Актера по фамилии " + replaceForActorSurname + " в постановке не найдено.");
    }

    public Director getDirector() {
        return director;
    }

    public List<Actor> getListOfActors() {
        return listOfActors;
    }

    public String getTitle() {
        return title;
    }

    public int getDurationMin() {
        return durationMin;
    }

    public void setDirector(Director newDirector) {
        this.director = newDirector;
        if (newDirector != null) {
            newDirector.incrementNumberOfShows();
        }
    }

    public void removeDirector() {
        if (director != null) {
            director.decrementNumberOfShows();
            this.director = null;
        }
    }
}