package homework11;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortUniqueWords {

    static final String TEXT = "Но я должен объяснить вам как родилась вся эта ошибочная идея отрицания удовольствия и восхваления боли и я дам вам полный отчет о системе и излагаю фактические учения великого исследователя истины Создатель человеческого счастья Никто не отвергает не любит и не избегает удовольствия как такового потому что это удовольствие а потому что те кто не знает как стремиться к удовольствию сталкиваются с чрезвычайно болезненными последствиями";
    static final String SPACE = " ";

    public static void main(String[] args) {

        String [] words = TEXT.toLowerCase().split(SPACE);

        Set<String> uniqueWords = new TreeSet<>(List.of(words));
        System.out.println(uniqueWords);
        
    }
}
