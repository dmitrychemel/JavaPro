package lesson6;

public class Light implements Iinfo{
    private boolean isOn;

    public Light(){
        isOn = false;
    }
    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Свет включена");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Свет выключена");
    }
}
