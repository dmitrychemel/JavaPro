package lesson11;

import java.util.*;

public class TextAlphabet {

    static final String TEXT = "но я должен объяснить вам как родилась вся эта ошибочная идея отрицания удовольствия и восхваления боли и я дам вам полный отчет о системе и излагаю фактические учения великого исследователя истины создатель человеческого счастья Никто не отвергает не любит и не избегает удовольствия как такового потому что это удовольствие а потому что те кто не знает как стремиться к удовольствию сталкиваются с чрезвычайно болезненными последствиями";
    static final String SPACE = " ";

    public static void main(String[] args) {

        char[] text = TEXT.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<>();
        for (char c : text) {
            alphabet.add(c);
        }

        Map <Character, Integer> text1 = new HashMap<>();

        for (int i = 0; i < alphabet.size(); i++) {
            if(text1.containsKey(alphabet.get(i))){
                int count = text1.get(alphabet.get(i));
                count++;
                text1.put(alphabet.get(i), count);
            } else {
                text1.put(alphabet.get(i), 1);
            }
        }

        System.out.println(text1);

    }
}
