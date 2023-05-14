package homework3;

public class Cat extends Animal {
    public Cat(String type, int swim, int run) {
        super(type, swim, run);
    }

    @Override
    public String run (int distance){
        if(this.run>distance){
            return type + " Пробежал дистанцию " + distance + " метров";
        }
        else {
            return type + " Не пробежал дистанцию "+ distance + " метров";
        }
    }
    @Override
    public String swim(int distance) {
        if(this.swim>distance){
            return type + " Проплыл дистанцию "+ distance + " метров";
        }
        else {
            return type + " Не проплыл дистанцию "+ distance + " метров";
        }
    }
}
