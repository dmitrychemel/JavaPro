package homework11;

import java.util.HashSet;

public class CarPark {
    public static void main(String[] args) {
        HashSet<Car> carHashSet = new HashSet<>();

        carHashSet.add(new Car("ABC123", "BMW", 200, 100.0));
        carHashSet.add(new Car("DEF456", "Audi", 180, 90.0));
        carHashSet.add(new Car("GHI789", "Mercedes", 220, 110.0));
        carHashSet.add(new Car("JKL012", "BMW", 190, 95.0));
        carHashSet.add(new Car("MNO345", "Audi", 210, 105.0));

        System.out.println(carHashSet);
    }
}
