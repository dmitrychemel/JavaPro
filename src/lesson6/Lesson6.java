package lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson6 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(17);
        list.add(23);
        System.out.println(list);
        System.out.println(list.get(1));
        list.remove(1);
        System.out.println(list);
        System.out.println("----RubbrtArray");

        RubberArray rb = new RubberArray();
        rb.add(8);
        rb.add(17);
        rb.add(23);
        System.out.println(rb);




    }
}
