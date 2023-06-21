package lesson9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lesson9 {
    public static void main(String[] args) {
//        List<Human> classHumans = new ArrayList<>();
//        classHumans.add(new Human("Вася", "Пупкин"));
//        classHumans.add(new Human("Иван", "Иванов"));
//        classHumans.add(new Human("Петр", "Петров"));
//        classHumans.add(new Human("Алексей", "Сидоров"));
//        classHumans.add(new Human("Мария", "Смирнова"));
//        classHumans.add(new Human("Елена", "Козлова"));
//        classHumans.add(new Human("Андрей", "Кузнецов"));
//        classHumans.add(new Human("Наталья", "Васильева"));
//        classHumans.add(new Human("Сергей", "Петров"));
//        classHumans.add(new Human("Ольга", "Морозова"));
//        classHumans.add(new Human("Вася", "Иванов"));
//        classHumans.add(new Human("Вася", "Сидоров"));
//
//        System.out.println(classHumans);
//        Collections.sort(classHumans);
//        System.out.println();
//        System.out.println(classHumans);

        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(1, LocalDate.of(2021,5,23),"HIGH","OPEN"));
        tasks.add(new Task(1, LocalDate.of(2027,5,23),"LOW","OPEN"));
        tasks.add(new Task(2, LocalDate.of(2027,7,23),"NORMAL","FIXED"));
        tasks.add(new Task(11, LocalDate.of(2023,8,23),"LOW","FIXED"));
        tasks.add(new Task(5, LocalDate.of(2024,5,23),"HIGH","FIXED"));
        tasks.add(new Task(0, LocalDate.of(2020,9,23),"NORMAL","OPEN"));

        Collections.sort(tasks);
        System.out.println(tasks);
        tasks.sort(new TaskStatusPriorityComparator());
        System.out.println(tasks);
        tasks.sort(new TaskDateComparator());
        System.out.println(tasks);
    }
}
