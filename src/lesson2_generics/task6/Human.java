package lesson2_generics.task6;

public abstract class Human {
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
