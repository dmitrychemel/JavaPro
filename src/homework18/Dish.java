package homework18;

public class Dish {
    private String name;
    private String mainIngredient;
    private int calories;

    public Dish(String name, String mainIngredient, int calories) {
        this.name = name;
        this.mainIngredient = mainIngredient;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public String getMainIngredient() {
        return mainIngredient;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", ingredients='" + mainIngredient + '\'' +
                ", calories=" + calories +
                '}';
    }
}
