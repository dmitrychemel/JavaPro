package homework5;

import com.sun.source.tree.Tree;

import java.util.*;

public class TelephoneBook {

    private Map<String, List<Integer>> phoneBook = new HashMap<>();

    public void add(String name, int phone){
        List<Integer> phones = phoneBook.get(name);
        if(phones == null){
            phones = new ArrayList<>();
        }
        phones.add(phone);
        phoneBook.put(name, phones);
    }

    public List<Integer> get(String name) {
        return phoneBook.get(name);
    }
}
