package homework4;

/**
 * Java Pro. Homework #4
 * @author Dzmitry Chemel
 * @version 14 May 2023
 */

public class EatCats {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Ivan", 10),
                new Cat("Kuzia", 15),
                new Cat("Boris", 20),
                new Cat("Kuzia", 25),
                new Cat("Murzik", 30)
        };
        Plate plate = new Plate(60);

        for(Cat cat: cats){
            cat.eat(plate);
            System.out.println(cat.toString());
        }

        plate.addFood(60);

        for(Cat cat: cats){
            cat.eat(plate);
            System.out.println(cat.toString());
        }
    }
}
