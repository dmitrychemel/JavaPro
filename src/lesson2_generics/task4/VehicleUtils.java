package lesson2_generics.task4;

import java.util.List;

public class VehicleUtils {

    public static void moveVehicles(List<? extends Car> from, List<? super Car> to) {
        to.addAll(from);
        from.clear();
    }
}
