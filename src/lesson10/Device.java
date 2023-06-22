package lesson10;

public class Device implements Comparable<Device>{
    private final String name;
    private final String status;
    private final String events;

    public Device(String name, String status, String events) {
        this.name = name;
        this.status = status;
        this.events = events;
    }

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", events='" + events + '\'' +
                '}';
    }

    @Override
    public int compareTo(Device o) {
        if(this.status.equals("EMERGENCY") && !o.status.equals("EMERGENCY")){
            return -1;
        }
        if(!this.status.equals("EMERGENCY") && o.status.equals("EMERGENCY")){
            return 1;
        }

        return 0;
    }
}
