package lesson6;

public class SmartHome {
    private boolean atHome;
    private Alarm alarm;
    private Light light;
    private Tv tv;
    public Dishwasher dishwasher;

    public SmartHome(){
        atHome = false;
        alarm = new Alarm();
        light = new Light();
        tv = new Tv();
        dishwasher = new Dishwasher();
    }

    public void setAtHome(boolean atHome) {
        this.atHome = atHome;
    }

    public void turnOnAlarm(){
        alarm.turnOn();
    }

    public void turnOffAlarm(){
        alarm.turnOff();
    }

    public void turnOnTv(){
        tv.turnOn();
    }

    public void turnOffTv(){
        tv.turnOff();
    }

    public void turnOnLight(){
        light.turnOn();
    }

    public void turnOffLight(){
        light.turnOff();
    }

    public void turnOnDishwasher(){
        dishwasher.turnOn();
    }

    public void turnOffDishwasher(){
        dishwasher.turnOff();
    }
}
