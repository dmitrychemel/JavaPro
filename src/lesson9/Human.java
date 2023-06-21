package lesson9;

public class Human implements Comparable<Human>{
    String name;
    String secondName;

    public Human(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Human o) {
        if(this.name.equalsIgnoreCase(o.name)){
            return this.secondName.compareTo(o.secondName);
        }
        return this.name.compareTo(o.name);
    }
}
