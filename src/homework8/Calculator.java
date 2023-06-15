package homework8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Java Pro. Homework #8
 * @author Dzmitry Chemel
 * @version 15 June 2023
 */

public class Calculator {
    public static void main(String[] args) {
        List<String> expression = readExpression();
        System.out.println("Выражение: " + expression);
        double result = evaluateExpression(expression);
        System.out.println("Результат: " + result);
    }
    public static List<String> readExpression(){
        List <String> expression = new ArrayList<>();
        Scanner scan = new Scanner(System.in);


        while (true){
            System.out.println("Напиши число");
            String firstNumber = scan.nextLine();
            expression.add(firstNumber);
            System.out.println("Напиши знак вычисления +, -, *, / или = чтобы закончить выражение");
            String operand = scan.nextLine();
            if(operand.equals("=")){
                break;
            }
            expression.add(operand);
        }
        return expression;
    }

    public static double evaluateExpression(List<String> expression){
        double result = Double.parseDouble(expression.get(0));
        for (int i = 1; i < expression.size(); i += 2) {
            String operand = expression.get(i);
            double number = Double.parseDouble(expression.get(i+1));

            switch (operand){
                case "+":
                    result += number;
                    break;
                case "-":
                    result -= number;
                    break;
                case "*":
                    result *= number;
                    break;
                case "/":
                    result /= number;
                    break;
            }
        }
        return result;
    }
}
