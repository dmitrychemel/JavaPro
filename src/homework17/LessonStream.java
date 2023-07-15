package homework17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LessonStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1", "b5", "a2", "b4");
        String result = list.stream().min(String::compareTo).orElse(null);
        System.out.println(result);

        List<Integer> list1 = Arrays.asList(1, 12, 3, 10, 12, 17);
        List<Integer> result1 = list1.stream().filter(e -> e % 2 != 0).toList();
        System.out.println(result1);

        List<Integer> list2 = Arrays.asList(1, 12, 3, 10, 12, 17);
        List<Double> result2 = list2.stream().mapToDouble(e -> e * 1.2).boxed().toList();
        System.out.println(result2);

        List<String> list3 = Arrays.asList("BigBen", "BigBob", "Big", "Ben", "Big Bob");
        long result3 = list3.stream().filter(e -> e.contains("Big")).count();
        System.out.println(result3);

        List<String> list4 = Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");
        List<String> result4 = list4.stream().sorted(Comparator.reverseOrder()).distinct().toList();
        System.out.println(result4);

        List<Integer> list5 = Arrays.asList(1, 12, 3, 10, 12, 17);
        long result5 = list5.stream().reduce(Integer::sum).get();
        System.out.println(result5);

        List<Integer> list6 = Arrays.asList(1, 12, 3, 10, 12, 17);
        double result6 = list6.stream().reduce(0, Integer::sum).doubleValue() / list6.size();
        System.out.println(result6);

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Anton"));
        personList.add(new Person("Dima"));
        personList.add(new Person("Sasha"));
        personList.add(new Person("Grisha"));
        personList.add(new Person("Andrey"));
        List<Person> personListResult = personList.stream().sorted(Comparator.comparing(Person::getName)).toList();
        System.out.println(personListResult);

        List<String> text = Arrays.asList("привет как тебя зовут", "привет меня зовут Игорь а тебя как", "меня Даник что будешь делать в программировании", "пока");

        List<String> uniqueWords = text.stream().flatMap(sentence -> Arrays.stream(sentence.split(" "))).distinct().toList();
        System.out.println("Unique words - " + uniqueWords);

        long countWords = text.stream().flatMap(sentence -> Arrays.stream(sentence.split(" "))).distinct().count();
        System.out.println("Count words - " + countWords);

        String longestWord = text.stream().flatMap(sentence -> Arrays.stream(sentence.split(" "))).max(Comparator.comparing(String::length)).orElse("");
        System.out.println("Longest word - " + longestWord);

        List<String> sortedList = text.stream().sorted(Comparator.comparingInt(sentence -> sentence.split(" ").length)).sorted(Comparator.comparing(String::length).reversed()).toList();
        System.out.println("sorted List - " + sortedList);



    }
}
