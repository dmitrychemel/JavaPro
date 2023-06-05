package homework7;

public class PrintedEdition {
    private int numberCatalog;
    private String name;
    private float cost;
    private String location;
    private String visitor;

    public PrintedEdition(int numberCatalog, String name, float cost, String location) {
        this.numberCatalog = numberCatalog;
        this.name = name;
        this.cost = cost;
        this.location = location;
        this.visitor = "";
    }

    public int getNumberCatalog() {
        return numberCatalog;
    }

    public String getName() {
        return name;
    }

    public float getCost() {
        return cost;
    }

    public String getLocation() {
        return location;
    }

    public String getVisitor() {
        return visitor;
    }

    public void setVisitor(String visitor){
        this.visitor = visitor;
    }

    public boolean canBeIssued(){
        return cost <= 100000;
    }

    @Override
    public String toString() {
        return "PrintedEdition{" +
                "numberCatalog=" + numberCatalog +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", location='" + location + '\'' +
                ", visitor='" + visitor + '\'' +
                '}';
    }
}
