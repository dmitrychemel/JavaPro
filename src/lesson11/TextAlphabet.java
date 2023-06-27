package lesson11;

import java.util.*;

public class TextAlphabet {

    static final String TEXT = "но я должен объяснить вам как родилась вся эта ошибочная идея отрицания удовольствия и восхваления боли и я дам вам полный отчет о системе и излагаю фактические учения великого исследователя истины создатель человеческого счастья Никто не отвергает не любит и не избегает удовольствия как такового потому что это удовольствие а потому что те кто не знает как стремиться к удовольствию сталкиваются с чрезвычайно болезненными последствиями";

    public static void main(String[] args) {
        Map <Character, Integer> alphabet = new HashMap<>();

        for (int i = 0; i < TEXT.length(); i++) {
            Character ch = Character.toUpperCase(TEXT.charAt(i));
            if(ch.equals(' ')){
                continue;
            }

            if(alphabet.containsKey(TEXT.charAt(i))){
                Integer count = alphabet.get(ch);
                count++;
                alphabet.put(TEXT.charAt(i), count);
            } else {
                alphabet.put(ch, 1);
            }
        }

        Set<Character> keys = alphabet.keySet();

        Iterator<Character> keysIt = keys.iterator();
        while (keysIt.hasNext()){
            Character key = keysIt.next();
            Integer value = alphabet.get(key);
            System.out.println(key + " -> " + value);
        }
    }
}
