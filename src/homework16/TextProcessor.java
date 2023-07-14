package homework16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class TextProcessor {

    public void processString(String text, Function<String, String> lambdaFunction) {
        String[] words = text.split(" ");
        System.out.println(lambdaFunction.apply(String.join(" ", words)));
        System.out.println();
    }

    public String filterText(String text, Predicate<Character> number) {
        StringBuilder sb = new StringBuilder();
        for (char chars : text.toCharArray()) {
            if (number.test(chars)) {
                sb.append(chars);
            }
        }

        return sb.toString();
    }

    public int sum(String input, Function<List<Integer>, Integer> function) {
        List<Integer> integerList = new ArrayList<>();

        String[] numbers = input.split(",");
        for (String num : numbers) {
            integerList.add(Integer.parseInt(num));
        }

        return function.apply(integerList);
    }

}
