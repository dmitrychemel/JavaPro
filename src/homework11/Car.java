package homework11;

import java.util.Objects;

public class Car {
    private String licence;
    private String brand;
    private int enginePower;
    private double cost;

    public Car(String licence, String brand, int enginePower, double cost) {
        this.licence = licence;
        this.brand = brand;
        this.enginePower = enginePower;
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return enginePower == car.enginePower && Double.compare(car.cost, cost) == 0 && Objects.equals(licence, car.licence) && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(licence, brand, enginePower, cost);
    }

    @Override
    public String toString() {
        return
                "Номер: '" + licence + '\'' +
                ", Марка: '" + brand + '\'' +
                ", Мощность: " + enginePower +
                ", Стоимость: " + cost +
                "}\n";
    }
}
