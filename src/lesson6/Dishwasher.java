package lesson6;

public class Dishwasher implements Iinfo{
    private boolean isOn;
    private boolean insideDishes;

    public Dishwasher(){
        isOn = false;
        insideDishes = false;
    }

    public void setInsideDishes(boolean insideDishes) {
        this.insideDishes = insideDishes;
    }

    @Override
    public void turnOn() {
        if(insideDishes) {
            isOn = true;
            System.out.println("Посудомойка включена");
        } else {
            System.out.println("Нет посуды");
        }
    }

    @Override
    public void turnOff() {
        isOn = false;
        insideDishes = false;
        System.out.println("Посудомойка выключена");
    }
}
