package lesson6;

public class Alarm implements Iinfo{
    private boolean isOn;

    public Alarm(){
        isOn = false;
    }
    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Сигнализация включена");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Сигнализация выключена");
    }
}
