package lesson6;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        SmartHome smartHome = new SmartHome();
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Войти в дом -1, выйти - 0");
            int atHomeInput = scan.nextInt();
            boolean atHome = (atHomeInput == 1);

            smartHome.setAtHome(atHome);

            if(atHome){
                smartHome.turnOffAlarm();
                smartHome.turnOnLight();
                smartHome.turnOnTv();
            } else {
                smartHome.turnOnAlarm();
                smartHome.turnOffLight();
                smartHome.turnOffTv();
            }
            System.out.println("Посуда внутри 1, нет посуды 0");
            int dishesInput = scan.nextInt();
            boolean dishesInsideDishwasher = (dishesInput == 1);

            smartHome.dishwasher.setInsideDishes(dishesInsideDishwasher);

            if (!atHome && dishesInsideDishwasher) {
                smartHome.turnOnDishwasher();
            }else {
                smartHome.turnOffDishwasher();
            }

            System.out.println();
        }
    }

}
