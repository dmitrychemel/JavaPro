package lesson9;

import java.time.LocalDate;

public class Task implements Comparable<Task>{
    private int id;
    private LocalDate dateOfTask;
    private String priority;
    private String status;

    public Task(int id,LocalDate dateOfTask, String priority, String status) {
        this.dateOfTask = dateOfTask;
        this.id = id;
        this.priority = priority;
        this.status = status;
    }

    public LocalDate getDateOfTask() {
        return dateOfTask;
    }

    public String getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", dateOfTask=" + dateOfTask +
                ", priority='" + priority + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    @Override
    public int compareTo(Task o) {
        return Integer.compare(this.id, o.id);
    }
}
