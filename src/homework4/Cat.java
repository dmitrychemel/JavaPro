package homework4;

public class Cat {
    private String name;
    private int appetite;
    private boolean hungry = true;

    public Cat(String name, int fullness){
        this.appetite =fullness;
        this.name = name;
    }

    public void eat(Plate plate){
        if(hungry && plate.decreaseFood(appetite)){
            hungry = false;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", hungry=" + hungry +
                '}';
    }
}
