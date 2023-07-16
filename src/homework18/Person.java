package homework18;

public class Person {

    private String name;
    private String department;
    private double salary;
    private String position;

    public Person(String name, String department, int salary, String position) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                '}';
    }
}


