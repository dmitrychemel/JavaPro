package homework10;

import java.util.*;

/**
 * Java Pro. Homework #10
 * @author Dzmitry Chemel
 * @version 18 June 2023
 */

public class CountingTime {

    private static final int COLLECTION_SIZE = 10000;
    private static final Random random = new Random();

    public static void main(String[] args) {

        List<String> linkedList = new LinkedList<>();
        List<String> arrayList = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {

        }
        for (int i = 0; i < 5; i++) {
            long startTime = System.currentTimeMillis();
            addRandomValuesToTail(linkedList);
            long endTime = System.currentTimeMillis();
            System.out.printf("Добавление в %s заняла %s мс%n", "LinkedList", endTime - startTime);

            long startTime1 = System.currentTimeMillis();
            addRandomValuesToTail(arrayList);
            long endTime1 = System.currentTimeMillis();
            System.out.printf("Добавление в %s заняла %s мс%n", "ArrayListList", endTime1 - startTime1);

        }
        long startTime = System.currentTimeMillis();
        addRandomValuesToTail(linkedList);
        long endTime = System.currentTimeMillis();
        System.out.printf("Добавление в %s заняла %s мс%n", "LinkedList", endTime - startTime);

        long startTime1 = System.currentTimeMillis();
        addRandomValuesToTail(arrayList);
        long endTime1 = System.currentTimeMillis();
        System.out.printf("Добавление в %s заняла %s мс%n", "ArrayListList", endTime1 - startTime1);


        startTime = System.currentTimeMillis();
        addRandomValuesToCenter(linkedList);
        endTime = System.currentTimeMillis();
        System.out.printf("Добавление в центр в %s заняла %s мс%n", "LinkedList", endTime - startTime);

        startTime = System.currentTimeMillis();
        addRandomValuesToCenter(arrayList);
        endTime = System.currentTimeMillis();
        System.out.printf("Добавление в центр в %s заняла %s мс%n", "ArrayListList", endTime - startTime);

        startTime = System.currentTimeMillis();
        getValuesWithRandomIndex(linkedList);
        endTime = System.currentTimeMillis();
        System.out.printf("Получение по индексу в %s заняла %s мс%n", "LinkedList", endTime - startTime);

        startTime = System.currentTimeMillis();
        getValuesWithRandomIndex(arrayList);
        endTime = System.currentTimeMillis();
        System.out.printf("Получение по индексу в %s заняла %s мс%n", "ArrayListList", endTime - startTime);

        startTime = System.currentTimeMillis();
        deleteValuesFromTail(linkedList);
        endTime = System.currentTimeMillis();
        System.out.printf("Удаление с конца в %s заняла %s мс%n", "LinkedList", endTime - startTime);

        startTime = System.currentTimeMillis();
        deleteValuesFromTail(arrayList);
        endTime = System.currentTimeMillis();
        System.out.printf("Удаление с конца в %s заняла %s мс%n", "ArrayListList", endTime - startTime);

        startTime = System.currentTimeMillis();
        deleteValuesFromCenter(linkedList);
        endTime = System.currentTimeMillis();
        System.out.printf("Удаление с центра в %s заняла %s мс%n", "LinkedList", endTime - startTime);

        startTime = System.currentTimeMillis();
        deleteValuesFromCenter(arrayList);
        endTime = System.currentTimeMillis();
        System.out.printf("Удаление с центра в %s заняла %s мс%n", "ArrayListList", endTime - startTime);
    }

    public static void deleteValuesFromCenter(List<String> linkedList){
        ListIterator<String> listIterator = linkedList.listIterator();
        for (int i = 0; i < COLLECTION_SIZE/2; i++) {
            listIterator.next();
        }

        while (listIterator.hasNext()){
            listIterator.next();
            listIterator.remove();
        }
    }

    public static void deleteValuesFromTail(List<String> linkedList) {
        for (int i = 0; i < COLLECTION_SIZE; i++) {
            linkedList.remove(linkedList.size() - 1);
        }
    }

    public static void getValuesWithRandomIndex(List<String> linkedList) {
        for (int i = 0; i < COLLECTION_SIZE; i++) {
            linkedList.get(generateRandomInteger());
        }

    }

    public static void addRandomValuesToCenter(List<String> linkedList) {
        ListIterator<String> iterator = linkedList.listIterator();
        for (int i = 0; i < COLLECTION_SIZE / 2; i++) {
            iterator.next();
        }

        for (int i = 0; i < COLLECTION_SIZE; i++) {
            iterator.add(generateRandomValue());

        }
    }

    public static void addRandomValuesToTail(List<String> linkedList) {
        for (int i = 0; i < COLLECTION_SIZE; i++) {
            linkedList.add(generateRandomValue());
        }
//        for(String str: linkedList){
//            linkedList.add(generateRandomValue());
//        }
    }

    public static String generateRandomValue() {
        return UUID.randomUUID().toString();
    }

    public static int generateRandomInteger() {
        return random.nextInt(COLLECTION_SIZE);
    }
}
