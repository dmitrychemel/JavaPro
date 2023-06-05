package homework7;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<PrintedEdition> printedEditions;

    public Library() {
        printedEditions = new ArrayList<>();
    }

    public void addPrintedEditions(PrintedEdition printedEdition){
        printedEditions.add(printedEdition);
    }

    public void infoCatalog(){
        for(PrintedEdition printedEdition: printedEditions){
            if(printedEditions instanceof Book){
                System.out.println("Книга" + printedEdition.toString());
            } else if (printedEditions instanceof Magazine) {
                System.out.println("Журнал" + printedEdition.toString());
            }
        }
    }
}
