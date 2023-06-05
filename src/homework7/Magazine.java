package homework7;

public class Magazine extends PrintedEdition {
    private int year;
    private int number;

    public Magazine(int numberCatalog, String name, float cost, String location, int year, int number) {
        super(numberCatalog, name, cost, location);
        this.year = year;
        this.number = number;
    }

    public int getYear() {
        return year;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "year=" + year +
                ", number=" + number +
                '}';
    }
}
