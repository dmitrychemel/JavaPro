package homework4;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public boolean decreaseFood(int appetiteCat) {
        if(food-appetiteCat<0){
            return false;
        }else{
            food -= appetiteCat;
            return true;
        }
    }

    public void addFood (int food){
        this.food += food;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}
