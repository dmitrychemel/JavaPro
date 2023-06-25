package homework11;

import java.util.Set;
import java.util.TreeSet;

public class Color {
    public static void main(String[] args) {
        Set<Rainbow.Color> rainbowColors = new TreeSet<>();

        // Добавляем цвета радуги в TreeSet
        rainbowColors.add(Rainbow.Color.Orange);
        rainbowColors.add(Rainbow.Color.Red);
        rainbowColors.add(Rainbow.Color.Blue);
        rainbowColors.add(Rainbow.Color.Yellow);
        rainbowColors.add(Rainbow.Color.Violet);
        rainbowColors.add(Rainbow.Color.Green);
        rainbowColors.add(Rainbow.Color.Indigo);

        System.out.println(rainbowColors);

    }
}
