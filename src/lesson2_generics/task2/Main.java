package lesson2_generics.task2;

import homework3.Cat;

public class Main {

    public static void main(String[] args) {
        print("Hello World!");
        print(new Cat("Vasya", 134, 500));
    }

    public static <T> void print(T item){
        System.out.println(item);
    }
}
