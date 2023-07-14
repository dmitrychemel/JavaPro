package homework16;

/**
 * Java Pro. Homework #13
 * @author Dzmitry Chemel
 * @version 14 July 2023
 */

public class UseTest {
    public static void main(String[] args) {

        TextProcessor textProcessor = new TextProcessor();

        String text = "Равным образом рамки и место обучения кадров создаёт предпосылки качественно новых шагов для соответствующих условий активизации";
        String text1 = "Hello123World456";
        String text2 = "1,2,3,4,5";
        System.out.println("Исходный текст:");
        System.out.println(text);

        System.out.println("Приведение к верхнему регистру:");
        textProcessor.processString(text, String::toUpperCase);
        System.out.println("*----------------*");

        System.out.println("Сокращение длины строки до трех символов:");
        textProcessor.processString(text, phrase -> {
            StringBuilder result = new StringBuilder();
            for (String word : phrase.split(" ")) {
                if (word.length() > 3) {
                    result.append(word, 0, 3).append(" ");
                } else {
                    result.append(word).append(" ");
                }
            }
            return result.toString().trim();
        });
        System.out.println("*----------------*");

        System.out.println("Возврат длины строки вместо содержимого:");
        textProcessor.processString(text, str -> String.valueOf(str.length()));
        System.out.println("*----------------*");

        String result = textProcessor.filterText(text1, Character::isDigit);
        int resultSum = textProcessor.sum(text2, nums -> {
            int sum = 0;
            for (int num : nums) {
                sum += num;
            }
            return sum;
        });

        System.out.println(result);
        System.out.println(resultSum);

    }
}
