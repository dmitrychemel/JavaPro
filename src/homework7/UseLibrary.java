package homework7;

/**
 * Java Pro. Homework #7
 * @author Dzmitry Chemel
 * @version 05 June 2023
 */

public class UseLibrary {
    public static void main(String[] args) {
        Library library = new Library();

        Book book = new Book(1,"Dog", 12345,"Вторая полка", "Isbn - AF411TT");
        Book bookSecond = new Book(2,"Cat", 11111,"Вторая полка, третий рял", "Isbn - 888Н0");
        Magazine magazine = new Magazine(3, "Dog2", 11000, "Первая полка", 1999, 110);
        Magazine magazineSecond = new Magazine(4, "Cat2", 9990, "Четвертая полка", 1998, 91);

        library.addPrintedEditions(book);
        library.addPrintedEditions(bookSecond);
        library.addPrintedEditions(magazine);
        library.addPrintedEditions(magazineSecond);

        library.infoCatalog();
    }
}
