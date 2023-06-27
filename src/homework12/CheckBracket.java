package homework12;
import java.util.Stack;

/**
 * Java Pro. Homework #12
 * @author Dzmitry Chemel
 * @version 25 June 2023
 */

public class CheckBracket {
    public static void main(String[] args) {
        String example1 = "(2 + 3) * (5 - 2)";
        String example2 = "(2 + 3 * (5 - 2)";
        String example3 = "(2 + 3) * 5 - 2)";
        String example4 = "((2 + 3) * 5 - 2)";

        System.out.println(checkBrackets(example1));
        System.out.println(checkBrackets(example2));
        System.out.println(checkBrackets(example3));
        System.out.println(checkBrackets(example4));
    }

    public static String checkBrackets(String example){
        Stack<Character> stack = new Stack<>();

//        for(char ch: example.toCharArray()){
//            if(ch == '('){
//                if(stack.isEmpty() || stack.pop() == ')'){
//                    stack.push(ch);
//                } else {
//                    return "Ошибка: не закрыта скобка";
//                }
//            }
//            if (ch == ')'){
//                if(stack.isEmpty() || stack.pop() != '('){
//                    return "Ошибка: не открыта скобка";
//                } else {
//                    stack.push(ch);
//                }
//            }
//        }

        for(char ch: example.toCharArray()){
            if(ch == '('){
                stack.push(ch);
            }
            if (ch == ')'){
                if(stack.isEmpty()){
                    return "Ошибка: не открыта скобка";
                } else{
                    stack.pop();
                }
            }
        }

        if(!stack.isEmpty()){
            return "Ошибка: не закрыта скобка";
        }

        return "Скобки расставлены правильно";
    }
}
