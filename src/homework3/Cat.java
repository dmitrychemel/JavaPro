package homework3;

public class Cat extends Animal {
    public Cat(String type, int swim, int run) {
        super(type, swim, run);
    }

    @Override
    public int run (int distance){
        if(this.run>distance){
            System.out.print(type + " Пробежал дистанцию ");
        }
        else {
            System.out.print(type + " Не пробежал дистанцию ");
        }
        return distance;
    }
    @Override
    public int swim(int distance) {
        if(this.swim>distance){
            System.out.print(type + " Проплыл дистанцию ");
        }
        else {
            System.out.print(type + " Не проплыл дистанцию ");
        }
        return distance;
    }
}
