package homework11;

import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
        List<Integer> firstList = new ArrayList<>(List.of(1,2,4,3,5,6));
        List<Integer> secondList = new ArrayList<>(List.of(4,5,6,7,8,9));
        List<Integer> list = new ArrayList<>(List.of(11,24,1,5,61,12,52));

        System.out.println(common(firstList, secondList));
        findMinMax(list);
    }

    public static HashSet<Integer> common(List<Integer> firstList, List<Integer> secondList){
        HashSet<Integer> firstSet = new HashSet<>(firstList);
        HashSet<Integer> secondSet = new HashSet<>(secondList);

        firstSet.retainAll(secondSet);

        return firstSet;
    }

    public static void findMinMax(List<Integer> list){
        TreeSet<Integer> set = new TreeSet<>(list);
        int min = set.first();
        int max = set.last();
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
    }
}
