package lesson2_generics.task4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Vehicle> hangar = new ArrayList<>();
        hangar.add(new Airplane());
        hangar.add(new Boat());
        hangar.add(new Honda());

        List<Honda> garage = new ArrayList<>();
        garage.add(new Honda());
        garage.add(new Honda());
        garage.add(new Honda());

        System.out.println("Содержимое ангара:" + hangar);
        System.out.println("Содержимое гараж:" + garage);

        VehicleUtils.moveVehicles(garage, hangar);

        System.out.println("Содержимое ангара:" + hangar);
        System.out.println("Содержимое гараж:" + garage);

        List<Car> parking = new ArrayList<>();
        List<Toyota> toyotaGarage = new ArrayList<>();

        VehicleUtils.moveVehicles(toyotaGarage, parking);

        List<Boat> boats = new ArrayList<>();
        List<Audi> audiGarage = new ArrayList<>();

    }
}
