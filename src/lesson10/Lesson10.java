package lesson10;

import java.util.Scanner;
import java.util.Stack;

public class Lesson10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Напиши два слова");
        String firstWord = scan.nextLine();
        String secondWord = scan.nextLine();


        System.out.println("Слова обратные: " + reverseWord(firstWord, secondWord));
    }

    public static boolean reverseWord (String firstWord, String secondWord){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < firstWord.length(); i++) {
            stack.push(firstWord.charAt(i));
        }

        for (int i = 0; i < secondWord.length(); i++) {
            if(stack.pop() != secondWord.charAt(i)){
                return false;
            }
        }

        return true;
    }
}
