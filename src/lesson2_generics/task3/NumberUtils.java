package lesson2_generics.task3;

public class NumberUtils <T extends Number> {
    private T value;

    public NumberUtils(T value) {
        this.value = value;
    }

    public void printIntValue() {
        System.out.println(value.intValue());
    }
}
