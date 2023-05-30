package lesson6;

public class Tv implements Iinfo{
    private boolean isOn;

    public Tv(){
        isOn = false;
    }
    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Теливизор включена");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Телевизор выключена");
    }
}
