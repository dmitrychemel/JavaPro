package Lesson8;

import java.util.*;

public class LessonIterators {
    public static void main(String[] args) {
//        List<String> words = new ArrayList<>();
//        words.add("cats");
//        words.add("are");
//        words.add("funny");
//
//        List<String> reverseWords = new ArrayList<>();
//        ListIterator<String> listIterator = words.listIterator();
//        while (listIterator.hasNext()){
//            listIterator.next();
//        }
//
//        while (listIterator.hasPrevious()){
//            reverseWords.add(listIterator.previous());
//        }
//
//        System.out.println(reverseWords);

//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(4);
//        numbers.add(5);
//        numbers.add(6);
//        numbers.add(7);
//        numbers.add(8);
//        numbers.add(9);
//
//        int min = 4;
//        int max = 7;
//
//        ListIterator<Integer> listIt = numbers.listIterator();
//        while(listIt.hasNext()){
//            Integer number = listIt.next();
//            if(number <= min || number >= max){
//                listIt.remove();
//            }
//        }
//
//        System.out.println(numbers);

//        List<Double> numbers = new ArrayList<>();
//        numbers.add(3.14);
//        numbers.add(1.731);
//        numbers.add(3.567);
//        numbers.add(0.214);
//        numbers.add(2.523);
//        bubbleSort(numbers);
//        System.out.println(numbers);

//        List<Integer> arrayOne = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 0));
//        List<Integer> arrayTwo = new ArrayList<>(Arrays.asList(5, 1, 2, 7, 3, 2));
//        List<Integer> result = new ArrayList<>();
//
//        Collections.sort(arrayOne);
//        Collections.sort(arrayTwo);
//
//        Integer minValueArrayOne = arrayOne.get(0);
//        Integer minValueArrayTwo = arrayTwo.get(0);
//        if(minValueArrayOne < minValueArrayTwo){
//            arrayOne.removeIf(value -> value <= minValueArrayOne);
//        } else {
//            arrayTwo.removeIf(value -> value <= minValueArrayTwo);
//        }
//
//        Iterator<Integer> arrayOneIt = arrayOne.iterator();
//        Iterator<Integer> arrayTwoIt = arrayTwo.iterator();
//
//        while (arrayOneIt.hasNext() && arrayTwoIt.hasNext()){
//            Integer numOne = arrayOneIt.next();
//            Integer numTwo = arrayTwoIt.next();
//            if(numOne.equals(numTwo)){
//                result.add(numOne);
//            }
//        }
//
//        System.out.println(result);

        List<Integer> elements = new ArrayList<>(Arrays.asList(1, -3, 2, 6, 4, 5));
        int target = 9;

        for (int i = 0; i < elements.size(); i++) {
            int sum = 0;
            for (int j = i; j < elements.size(); j++) {
                sum += elements.get(j);

                if (sum == target) {
                    System.out.println("range: (" + i + "," + j + ")");
                }
            }

        }
    }

    public static void bubbleSort(List<Double> numbers) {
        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = 0; j < numbers.size() - i - 1; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    // Обмен значениями
                    double temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
            }
        }
    }
}