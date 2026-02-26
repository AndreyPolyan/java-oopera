package ru.practicum.yandex.model.workers;

import java.util.Objects;

public class Actor extends Person {
    private float height;

    public Actor(Gender gender, String name, String surname, float height) {
        super(gender, name, surname);
        this.height = height;
    }

    public Actor(Gender gender, String name, String surname) {
        super(gender, name, surname);
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        String strHeight = (this.height == 0) ? "Рост не указан" : Float.toString(this.height);
        return super.toString() + "(" + strHeight + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Actor actor = (Actor) o;
        return Float.compare(height, actor.height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height);
    }
}
