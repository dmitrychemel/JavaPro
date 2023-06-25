package homework11;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueWords {

    static final String TEXT = "Но я должен объяснить вам как родилась вся эта ошибочная идея отрицания удовольствия и восхваления боли и я дам вам полный отчет о системе и излагаю фактические учения великого исследователя истины Создатель человеческого счастья Никто не отвергает не любит и не избегает удовольствия как такового потому что это удовольствие а потому что те кто не знает как стремиться к удовольствию сталкиваются с чрезвычайно болезненными последствиями";
    static final String SPACE = " ";

    public static void main(String[] args) {

        String [] words = TEXT.toLowerCase().split(SPACE);
        int countTEXT = 0;
        for (String text: words){
            countTEXT++;
        }
        System.out.println("Слов в первоначальном тексте:" + SPACE +countTEXT);

        Set<String> uniqueWords = new HashSet<>(List.of(words));
        System.out.println(uniqueWords);
        int countUnique = 0;
        for (String text: uniqueWords){
            countUnique++;
        }
        System.out.println("Слов в новом тексте:" + SPACE + countUnique);
    }
}
