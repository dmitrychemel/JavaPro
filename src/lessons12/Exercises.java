package lessons12;

import java.util.TreeMap;

public class Exercises {

    static final String TEXT = "привет я человек что ты тут делаешь";
    static final String SPACE = " ";

    public static void main(String[] args) {
        TreeMap<String, String> translationRussian = new TreeMap<>();
        translationRussian.put("привет", "Hello");
        translationRussian.put("я", "I'm");
        translationRussian.put("человек", "human");
        translationRussian.put("что", "what");
        translationRussian.put("тут", "here");

        System.out.println(translation(translationRussian, TEXT));

    }

    private static StringBuffer translation(TreeMap<String, String> translationRussian, String text) {

        String[] words = TEXT.toLowerCase().split(SPACE);
        StringBuffer sb = new StringBuffer();

        for(String word: words){
            if(translationRussian.containsKey(word)){
                sb.append(translationRussian.get(word));
                sb.append(SPACE);
            } else {
                sb.append(word);
                sb.append(SPACE);
            }
        }

        return sb;
    }
}
