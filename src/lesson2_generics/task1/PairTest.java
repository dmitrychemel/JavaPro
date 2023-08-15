package lesson2_generics.task1;

import homework3.Cat;

public class PairTest {

    public static void main(String[] args) {

        Pair<String, Cat> pair1 = new Pair<>("Cat", new Cat("Borya", 100, 20));
        Pair<Double, Double> pair2 = new Pair<>(1.5, 5.12);

        System.out.println(pair1.getFirst());
        System.out.println(pair1.getSecond());
        System.out.println(pair2.getFirst());
        System.out.println(pair2.getSecond());
    }
}

