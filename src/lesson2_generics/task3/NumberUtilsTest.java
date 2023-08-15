package lesson2_generics.task3;

public class NumberUtilsTest {
    public static void main(String[] args) {

        Byte b = 10;
        Short s = 200;
        Integer i = 1235;
        Long l = 10L;
        Float f = 10.123f;
        Double d = 10.90;

        NumberUtils<Byte> utils1 = new NumberUtils<>(b);
        NumberUtils<Short> utils2 = new NumberUtils<>(s);
        NumberUtils<Integer> utils3 = new NumberUtils<>(i);
        NumberUtils<Long> utils4 = new NumberUtils<>(l);
        NumberUtils<Float> utils5 = new NumberUtils<>(f);
        NumberUtils<Double> utils6 = new NumberUtils<>(d);

        utils1.printIntValue();
        utils2.printIntValue();
        utils3.printIntValue();
        utils4.printIntValue();
        utils5.printIntValue();
        utils6.printIntValue();
    }
}
