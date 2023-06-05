package homework7;

public class Book extends PrintedEdition{
    private String isbn;

    public Book(int numberCatalog, String name, float cost, String location, String isbn) {
        super(numberCatalog, name, cost, location);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                '}';
    }
}
