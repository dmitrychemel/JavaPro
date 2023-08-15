package lesson_module5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        String text = "Apple Orange Banana Apricot";

        String regex = "a";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            System.out.print(matcher.start() + " ");
        }
    }
}
