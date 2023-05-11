package homework3;

public class Dog extends Animal {
    public Dog(String type, int swim, int run) {
        super(type, swim, run);
    }

    @Override
    public int run (int distance){
        if(this.run>distance){
            System.out.print(type + "Пробежала дистанцию ");
        }
        else {
            System.out.print(type + "Не пробежала дистанцию ");
        }
        return distance;
    }
    @Override
    public int swim(int distance) {
        if(this.swim>distance){
            System.out.print(type + "Проплыла дистанцию ");
        }
        else {
            System.out.print(type + "Не проплыла дистанцию ");
        }
        return distance;
    }
}

