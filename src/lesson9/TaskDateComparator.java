package lesson9;


import java.util.Comparator;

public class TaskDateComparator implements Comparator<Task> {

    @Override
    public int compare(Task task1, Task task2) {
        return task2.getDateOfTask().compareTo(task1.getDateOfTask());
    }
}
