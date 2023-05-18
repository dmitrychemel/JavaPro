package homework5;

import java.util.*;

/**
 * Java Pro. Homework #5
 * @author Dzmitry Chemel
 * @version 18 May 2023
 */

public class SeparatorCountWord {

    static String text = "Но я должен объяснить вам как родилась вся эта ошибочная идея отрицания удовольствия и восхваления боли и я дам вам полный отчет о системе и излагаю фактические учения великого исследователя истины Создатель человеческого счастья Никто не отвергает не любит и не избегает удовольствия как такового потому что это удовольствие а потому что те кто не знает как стремиться к удовольствию сталкиваются с чрезвычайно болезненными последствиями";

    public static void main(String[] args) {

        String[] words = text.toLowerCase().split(" ");
        System.out.println(Arrays.toString(words));


        Set<String> stringSet = new HashSet<>(List.of(words));
        System.out.println(stringSet);

        ArrayList<String> wordsList = new ArrayList<String>(stringSet);
        String[] uniqueWords = new String[stringSet.size()];

        for (int i = 0; i < wordsList.size(); i++) {
            uniqueWords[i] = wordsList.get(i);
        }

        for (int i = 0; i < uniqueWords.length ; i++) {
            int wordsCount = 0;
            for (int j = 0; j < words.length ; j++) {
                if(uniqueWords[i].equals(words[j])) {
                    wordsCount++;
                }
            }
            System.out.println(uniqueWords[i] + ":"+ wordsCount);
        }
    }
}
