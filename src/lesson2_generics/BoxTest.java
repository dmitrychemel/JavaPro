package lesson2_generics;

public class BoxTest {
    public static void main(String[] args) {

        Box<String> box1 = new Box();
        Box<Integer> box2 = new Box();

        box1.putItem("Hello");
        box2.putItem(10);

        System.out.println(box1.getItem().substring(0,2));
        System.out.println(box2.getItem().floatValue());

    }
}
