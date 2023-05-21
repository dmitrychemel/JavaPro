package homework6;

import java.util.ArrayList;
import java.util.List;

/**
 * Java Pro. Homework #4
 * @author Dzmitry Chemel
 * @version 21 May 2023
 */

public class Lesson6 {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        System.out.println("пустой - " + intList.isEmpty());
        intList.add(8);
        intList.add(17);
        intList.add(23);
        System.out.println(intList);
        intList.add(2,15);
        System.out.println(intList);

        List<Integer> newList = new ArrayList<>();
        newList.add(5);
        newList.add(6);
        newList.add(7);
        intList.addAll(newList);
        System.out.println(intList.get(1));
        intList.remove(1);
        System.out.println(intList);
        intList.remove(0);
        System.out.println(intList);

        System.out.println("*****");
        intList.addAll(1, newList);
        System.out.println(intList);

        boolean found = intList.contains(23);
        boolean found1 =intList.contains(1);
        System.out.println("1 = " + found);
        System.out.println("2 = " + found1);

        System.out.println("index = " + intList.indexOf(5));
        System.out.println("index = " + intList.indexOf(1));
        System.out.println("пустой - " + intList.isEmpty());

        System.out.println("Размер масисва - " + intList.size());

        intList.clear();
        System.out.println(intList);

        System.out.println("----RubbrtArray");

        RubberArray rb = new RubberArray();
        System.out.println("пустой - " + rb.isEmpty());
        rb.add(8);
        rb.add(17);
        rb.add(23);
        System.out.println(rb);
        rb.add(2,15);
        System.out.println(rb);


        int[] newRb = new int[]{5,6,7};
        rb.addAll(newRb);
        System.out.println(rb.get(1));
        rb.remove(1);
        System.out.println(rb);
        rb.remove(0);
        System.out.println(rb);

        System.out.println("*****");
        rb.addAll(1, newRb);
        System.out.println(rb);

        System.out.println("1 = " + rb.contains(23));
        System.out.println("2 = " + rb.contains(1));

        System.out.println("index = " + rb.indexOf(5));
        System.out.println("index = " + rb.indexOf(1));
        System.out.println("пустой - " + rb.isEmpty());

        System.out.println("Размер масисва - " + rb.size());

        rb.clear();
        System.out.println(rb);




    }
}
