package lesson7;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ArrayListTest {
    public static void main(String[] args) {
        System.out.println("Напиши слова, когда закончишь напиши слово стоп");
        boolean stop = true;
        List listWords = new ArrayList();
        Scanner scan = new Scanner(System.in);

        while(stop){
            String word = scan.nextLine();
            if(word.equals("стоп")){
                stop = false;
                break;
            } else {
                listWords.add(word.toUpperCase());
            }
        }

        System.out.println(listWords);
        System.out.println();

        System.out.println("Чтобы убрать слова с нечетным количеством букв напииш 1 или с четнеми 0");

        int deleted = scan.nextInt();

        if(deleted == 1) {
            for (int i = 0; i < listWords.size(); i++) {
                String str = (String) listWords.get(i);
                if(str.length() %2 == 1) {
                    listWords.remove(i);
                }
            }
        } else {
            for (int i = 0; i < listWords.size(); i++) {
                String str = (String) listWords.get(i);
                if(str.length() %2 == 0) {
                    listWords.remove(i);
                }
            }
        }
        System.out.println(listWords);
        System.out.println();
        scan.close();

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < listWords.size(); i++) {
            String str = (String) listWords.get(i);
            stringBuffer.append(str + " ");
        }
        System.out.println(stringBuffer);
    }
}
