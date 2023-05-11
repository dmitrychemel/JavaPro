package homework3;

/**
 * Java Pro. Homework #3
 * @author Dzmitry Chemel
 * @version 11 May 2023
 */
public class ActionsAnimal {
    public static void main(String[] args) {
        Animal[] animals = {new Cat("Кот", 0,200), new Dog("Собака", 10, 500)};

        for(Animal animal: animals){
            System.out.println(animal.swim(5));
            System.out.println(animal.run(300));
        }
    }
}
