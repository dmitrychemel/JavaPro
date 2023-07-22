package homework18;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupDishes {
    public static void main(String[] args) {
        List<Dish> dishList = new ArrayList<>();
        dishList.add(new Dish("Булка с изюмом","тесто", 120 ));
        dishList.add(new Dish("Мясо по французски","мясо", 140 ));
        dishList.add(new Dish("Форель","рыба", 95 ));
        dishList.add(new Dish("Булка с шоколадом","тесто", 140 ));
        dishList.add(new Dish("Семга","рыба", 110 ));
        dishList.add(new Dish("Рожок","тесто", 50 ));

        Map<String,Long> countByCalories = dishList.stream().filter(calories -> calories.getCalories() > 100).collect(Collectors.groupingBy(Dish::getMainIngredient, Collectors.counting()));
        System.out.println(countByCalories);
    }
}
