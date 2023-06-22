package lesson10;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class House {
    public static void main(String[] args) {

        Queue<Device> device = new PriorityQueue<>();
        device.add(new Device("Холодильник", "NORMAL", "Работает"));
        device.add(new Device("Телевизор", "EMERGENCY", "что-то не то"));
        device.add(new Device("Пульт", "NORMAL", "Работает"));
        device.add(new Device("Микро", "EMERGENCY", "упал"));
        device.add(new Device("Душ", "NORMAL", "Работает"));

        info(device);


    }

    public static void info(Queue<Device> device) {
        while (!device.isEmpty()){
            System.out.println(device.poll());
        }
    }
}
