package lesson7;

import java.util.ArrayList;
import java.util.List;

public class Lesson7 {
    public static void main(String[] args) {

        List<Document> docs = new ArrayList<>();
        docs.add(new Document(1,"Счет1"));
        docs.add(new Document(2,"Счет2"));
        docs.add(new Document(3,"Счет3"));

        docs.add(1, new Document(4,"Счет4"));
        Document doc5 = new Document(5, "Счет5");
        docs.set(2, doc5);
        docs.remove(0);
        docs.remove(doc5);

        printDocuments(docs);
    }

    static void printDocuments(List<Document> documents){
        for (int i = 0; i < documents.size(); i++) {
            Document doc = documents.get(i);
            System.out.println(doc);
        }
    }
}
