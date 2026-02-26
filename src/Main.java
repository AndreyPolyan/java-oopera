import ru.practicum.yandex.model.performance.*;
import ru.practicum.yandex.model.workers.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Создаем работников
        Director director = new Director(Gender.MALE, "Петр", "Иванов");
        Composer composer = new Composer(Gender.MALE, "Вольфганг", "Моцарт");
        Choreographer choreographer = new Choreographer(Gender.FEMALE, "Анна", "Павлова");

        Actor a1 = new Actor(Gender.MALE, "Иван", "Сидоров", 180);
        Actor a2 = new Actor(Gender.FEMALE, "Мария", "Петрова", 170);
        Actor a3 = new Actor(Gender.MALE, "Олег", "Кузнецов", 175);
        Actor a4 = new Actor(Gender.FEMALE, "Елена", "Смирнова", 168);

        // Набор 1: два актера
        List<Actor> castSet1 = new ArrayList<>();
        castSet1.add(a1);
        castSet1.add(a2);

        // Набор 2: три актера
        List<Actor> castSet2 = new ArrayList<>();
        castSet2.add(a2);
        castSet2.add(a3);
        castSet2.add(a4);

        // Создаем постановки

        // Show с пустым списком актёров (тест добавления в пустой)
        Show show = new Show(90, director, "Обычный спектакль");

        // Opera и Ballet — музыкальные постановки с либретто
        Opera opera = new Opera(150, director, castSet1, "Дон Жуан", composer, "Текст либретто оперы", 40);

        Ballet ballet = new Ballet(120, director, castSet2, "Лебединое озеро", composer, "Текст либретто балета", choreographer);

        // вывод списка актеров каждой постановки
        header("TEST: печать актеров (Show/Opera/Ballet)");
        System.out.println("[Show]");
        show.printActors();

        System.out.println("\n[Opera]");
        opera.printActors();

        System.out.println("\n[Ballet]");
        ballet.printActors();

        // добавление актера:
        // - в пустой список
        // - в список, где такой уже есть
        // - успешное добавление
        header("TEST: addActor в пустой список (Show)");
        show.addActor(a1);
        show.printActors();

        header("TEST: addActor дубликата (Show)");
        show.addActor(a1); // должен сказать "уже участвует"

        header("TEST: addActor успешное добавление (Show)");
        show.addActor(a2);
        show.printActors();

        // замена актера (успех и падение)
        header("TEST : replaceActor успех (Opera) — меняем актера по фамилии 'Сидоров'");
        Actor newActor = new Actor(Gender.MALE, "Новый", "Актер", 182);
        opera.replaceActor(newActor, "Сидоров");
        opera.printActors();

        header("TEST: replaceActor падение (Opera) — фамилия не найдена");
        opera.replaceActor(a3, "КакаяТоФамилия");

        // вывод libretto там где это возможно
        header("TEST: libretto (Opera/Ballet)");
        System.out.println("[Opera libretto]");
        opera.printLibretto();

        System.out.println("\n[Ballet libretto]");
        ballet.printLibretto();

        // вывод информации о режиссере
        header("TEST: информация о режиссере (для всех постановок)");
        System.out.println("\n[Show]");
        System.out.println(show.getDirector());

        // Убираем шоу у директора
        System.out.println("\nСнимаем директора с Show. Проверяем, что постановок стало меньше");
        show.removeDirector();
        System.out.println("[Opera]");
        System.out.println(opera.getDirector());

        //Возвращаем директора в шоу

        System.out.println("\nВозвращаем директора на Show. Проверяем, что постановок стало больше");
        show.setDirector(director);
        System.out.println("[Ballet]");
        System.out.println(ballet.getDirector());

    }


    private static void header(String text) {
        System.out.println();
        System.out.println("========== " + text + " ==========");
    }
}