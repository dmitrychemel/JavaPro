package lesson9;

import java.util.Comparator;

public class TaskStatusPriorityComparator implements Comparator<Task> {
    @Override
    public int compare(Task task1, Task task2) {
        if (task1.getStatus().equals("OPEN") && !task2.getStatus().equals("OPEN")) {
            return -1;
        } else if (!task1.getStatus().equals("OPEN") && task2.getStatus().equals("OPEN")) {
            return 1;
        }
        if (task1.getPriority().equals("HIGH") && !task2.getPriority().equals("HIGH")) {
            return -1;
        } else if (!task1.getPriority().equals("HIGH") && task2.getPriority().equals("HIGH")) {
            return 1;
        } else if(task1.getPriority().equals("NORMAL") && task2.getPriority().equals("LOW")) {
            return -1;
        } else if (task1.getPriority().equals("LOW") && task2.getPriority().equals("NORMAL")) {
            return 1;
        }

        return 0;
    }
}
