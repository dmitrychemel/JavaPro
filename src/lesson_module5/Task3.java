package lesson_module5;

import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {

        String text = "Hello7World!43I531study1Java.";

        String regex = "\\d{1,3}";
        Pattern pattern = Pattern.compile(regex);
        String[] words = pattern.split(text);

        for(String word : words){
            System.out.print(word + " ");
        }
    }
}
