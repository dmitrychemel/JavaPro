package lesson2_generics.task5;

import lesson2_generics.task4.Car;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> boxFruits = new ArrayList<>();

    public void putFruit(T fruit) {
        boxFruits.add(fruit);
    }

    public float getWeight() {
       if(boxFruits.size() > 0){
           return boxFruits.size() * boxFruits.get(0).getWeight();
       }
        return 0;
    }

    public boolean compare(Box<? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }

    public void putAll(Box<T> box) {
        box.boxFruits.addAll(boxFruits);
        boxFruits.clear();
    }


}
