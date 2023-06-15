package lesson7;

public class Document {
    int id;
    String title;

    public Document(int id, String title){
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
